package com.yz.bitedao.image.imageScan;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.yz.bitedao.report.LoopholeResult.ScanningResults;
import org.apache.commons.io.FilenameUtils;


/**
 * 镜像扫描
 * 1.获得本地镜像列表 （文件获取或者docker image ls）                   docker image inspect nginx:latest     
 * 2.保存到本地 docker save mysql:8 >/myfile/test/mysql-8.tar
 * 3.解压到各自文件夹读取 manifest.json 
 * 4.倒序进入layer文件夹解压. 
 * 5.探测镜像操作系统 获取不到跳过 
 * 6.获得安装软件
 * 7.漏洞库搜索
 */
public class GetImageSDK {
	static String Dir = ""; // 要遍历的文件路径
	//项目路径
    private static String path;
    static {
        path=GetImageSDK.class.getProtectionDomain().getCodeSource().getLocation().getPath();
        if(path.contains("file:")){
            path = path.substring(path.indexOf("file:")+5);
        }

        if (path.contains(".jar")) {
            path = path.substring(0, path.lastIndexOf(".jar"));
            path = path.substring(0, path.lastIndexOf("/"));
        }
    }
	static String outDir = ""; // 结果存放文件路径
	static String suffixes = ""; // 检索文件类型
	static String fileType = "image"; // 检查文件的类型
	static String InvalidName = ""; // 检测结果中删去大概率软件名称匹配错误的结果，例如删除软件名称为“requests”的结果
	// 汉化漏洞库
	static String chineseDescribePath = "";
	static String describePath = ""; // CVE漏洞描述文件路径
	static String scorePath = ""; // CVE漏洞评分文件路径
	static String vulnerabilityLibDir="";
	
	public static void main(String[] args) throws IOException {
		// 漏洞库索引文件夹
	    vulnerabilityLibDir = path + "/dependent/VulnerabilityLibrary/";
		// 漏洞字典地址
		describePath = path + "/dependent/describe.txt";
		chineseDescribePath = path + "/dependent/chineseDescribe.txt";
		scorePath = path + "/dependent/score.txt";
		
		File workPlacefile = new File(path + "/imageScanWorkPlace/");
		if(!workPlacefile.exists()){
			workPlacefile.mkdirs();
		}
		// 结果文件夹
		String outDir = args[0]+"image_result.json";
		//镜像扫描结果
		List<String> listJson = localImage();
		//提取扫描结果合成一个json
		getJson(listJson,outDir);
		//删除 imageScanWorkPlace下文件们
		deleteDir(path + "/imageScanWorkPlace/");
	}
	private static void getJson(List<String> listJson,String outDir) {
		//拼接json
		StringBuilder ansJsonBuilder = new StringBuilder("jsondata=[");
		for (String path : listJson) {
			ansJsonBuilder.append(readJsonFile(path) + ",");
		}
		ansJsonBuilder.deleteCharAt(ansJsonBuilder.length() - 1).append("]");
		// 输出地址
		try {
			File outputFileOk = new File(outDir);
			if (outputFileOk.exists()) {
				outputFileOk.delete();
			}
			outputFileOk.createNewFile();
			FileOutputStream writerStream = new FileOutputStream(outDir);
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(writerStream, "UTF-8"));
			writer.write(ansJsonBuilder.toString());
			writer.close();
		} catch (IOException e ) {
			e.printStackTrace();
		}
	}

	public static void deleteDir(String path) {
		excuteCommand("rm -rf "+path);
	}

	public static void creatSDKcsv(String outDirz, Map<String, String> sdkMaps) {
		System.out.println(outDirz + " " + sdkMaps);
		// 输出文件检查
		File file = new File(outDirz,FilenameUtils.getName(""));
		if (!file.exists()) {
			file.mkdir();
		}
		String outputPathOk = outDirz + "image_VersionOk.csv";
		// 输出文件检查
		File outputFileOk = new File(outputPathOk);
		if (outputFileOk.exists()) {
			outputFileOk.delete();
		}
		try {
			outputFileOk.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		int index = 0;
		for (String key : sdkMaps.keySet()) {
			writeData(outputPathOk, index+"," + key + "," + sdkMaps.get(key) + ",#");
			index++;
		}
	}
	public static List<String> localImage() {
		//json地址list
		ArrayList<String> listJson = new ArrayList<>();
		String workPlace =path + "/imageScanWorkPlace/";
		StringBuilder cmdCommand = new StringBuilder();
		cmdCommand.append("docker image ls");
		List<String> list = excuteCommand(cmdCommand.toString());
		for (String line : list) {
			String name = line.split("\\s+")[0];
			String version = line.split("\\s+")[1];
			if ("REPOSITORY".equals(name)) {
				continue;
			}
			String yuanName = name;
			if(name.contains("/")) {
				name=name.replaceAll("/", "-");
			}
			if(name.contains("none")) {
				continue;
			}
			 //处理last 获取版本 把本身放进去
			String lastVersion=""; 
			if("latest".equals(version)){
				List<String> versionList = excuteCommand("docker image inspect "+yuanName+":latest");
				for(String versionJn : versionList) {
					if(versionJn.contains(yuanName.toUpperCase()+"_VERSION")) {
						lastVersion=versionJn.trim().replaceAll("\"", "").split("=")[1].replaceAll(",", "");
						break;
					}
				}
			}
			String shellStr = "docker save "+yuanName+":"+version+"  -o "+workPlace+name+"-"+version+".tar";
			excuteCommand(shellStr);
			System.out.println(name + ":" + version + "打包完毕,进行解压");
			String pattern = new String("[`~!@#$^&*()=|{}':;',\\[\\].<>/?~！@#￥……&*（）——|{}【】‘；：”“'。，、？]");
			String imageworkPlace = workPlace + name + "_" + version.replaceAll(pattern, "");
			// 新建文件夹
			excuteCommand("mkdir " + workPlace + name + "_" + version.replaceAll(pattern, ""));
			excuteCommand("tar -xvf "+workPlace+name+"-"+version+".tar -C "+imageworkPlace);
			String manifestPath = imageworkPlace + "/manifest.json";
			String manifestJson = readJsonFile(manifestPath);
			JSONArray manifestArry = JSONArray.parseArray(manifestJson);
			JSONObject jb = JSONObject.parseObject(manifestArry.get(0).toString());
			JSONArray ma = JSONArray.parseArray(jb.get("Layers").toString());
			for (int i = 0; i < ma.size(); i++) {
				String[] layerAndPath = ma.get(i).toString().split("/");
				String layerPath = imageworkPlace + "/" + layerAndPath[0] + "/" + "layer.tar";
				excuteCommand("tar -xvf " + layerPath + "  -C " + imageworkPlace + "/" + layerAndPath[0] + "/");
				// 解压后的某个layer目录
				String layers = imageworkPlace + "/" + layerAndPath[0] + "/";
				File file = new File(layers + "/etc/os-release");
				// 安装的工具
				HashMap<String, String> sdkMap = new HashMap<>();
				if (file.exists()) {
					try {
						BufferedReader bf = new BufferedReader(new FileReader(file));
						String str;
						String osName = "";
						String osVersion = "";
						// 按行读取字符串
						while ((str = bf.readLine()) != null) {
							if (str.startsWith("ID")) {
								osName = str.split("=")[1].trim();
							}
							if (str.startsWith("VERSION_ID")) {
								osVersion = str.split("=")[1].trim();
							}
						}
						//LAST 加入本来版本
						if(!lastVersion.equals("")) {
							sdkMap.put(yuanName,lastVersion);
						}else {
							if(!version.equals("latest")) {
								sdkMap.put(yuanName,versionStandard(version));
							}
						}
						lastVersion="";
						// apk lib/apk/db/installed
						if ("alpine".equals(osName)) {
							File apkFile = new File( "/lib/apk/db/",FilenameUtils.getName("/lib/apk/db/instal"));
							if (apkFile.exists()) {
								BufferedReader apkbf = new BufferedReader(new FileReader(apkFile));
								String apkStr;
								ArrayList<String> plist = new ArrayList<>();
								ArrayList<String> vlist = new ArrayList<>();
								while ((apkStr = apkbf.readLine()) != null) {
									if (apkStr.startsWith("P:")) {
										plist.add(apkStr.split(":")[1].trim());
									}
									if (apkStr.startsWith("V:")) {
										vlist.add(versionStandard(apkStr.split(":")[1].trim()));
									}
								}
								for (int j = 0; j < plist.size(); j++) {
									sdkMap.put(plist.get(j), vlist.get(j));
								}
								apkbf.close();
							}
						}
						// /rpm var/lib/rpm/Packages
						if (osName.contains("centos") || osName.contains("rhel") || osName.contains("fedora")
								|| osName.contains("amzn") || osName.contains("oracle") || osName.contains("ol")) {
							File rpmFile = new File(layers + "/var/lib/rpm/Packages");
							if (rpmFile.exists()) {
								Process process = Runtime.getRuntime().exec(
										"rpm --dbpath " + layers + "var/lib/rpm/" + " -qa --qf  %{NAME}:%{VERSION}\\n");
								InputStreamReader isr = new InputStreamReader(process.getInputStream(), "utf-8");
								BufferedReader br = new BufferedReader(isr);
								String strs = null;
								while ((strs = br.readLine()) != null) {
									sdkMap.put(strs.split(":")[0], versionStandard(strs.split(":")[1]));
								}
								isr.close();
								br.close();
							}
						}
						// apkg var/lib/dpkg/status
						if ("debian".equals(osName) || "ubuntu".equals(osName)) {
							File apkgFile = new File(layers + "/var/lib/dpkg/status");
							if (apkgFile.exists()) {
								BufferedReader apkgbf = new BufferedReader(new FileReader(apkgFile));
								String apkgbfStr;
								ArrayList<String> plist = new ArrayList<>();
								ArrayList<String> vlist = new ArrayList<>();
								while ((apkgbfStr = apkgbf.readLine()) != null) {
									if (apkgbfStr.startsWith("Package:")) {
										plist.add(apkgbfStr.split(":")[1].trim());
									}
									if (apkgbfStr.startsWith("Version:")) {
										vlist.add(versionStandard(apkgbfStr.split(":")[1].trim()));
									}
								}
								for (int j = 0; j < plist.size(); j++) {
									sdkMap.put(plist.get(j), vlist.get(j));
								}
								apkgbf.close();
							}
						}
						bf.close();
						
						String sourceName = name+"_"+versionStandard(version);
						// 结果存放路径
						String outDirs =workPlace+ sourceName + "_Result/"; 
						//模拟创建依赖版本csv
						creatSDKcsv(outDirs,sdkMap);
						// 提交服务器扫描任务VO
						ScanningResults scanningResults = new ScanningResults();
						scanningResults.setScanningObject(name);
						scanningResults.setEdition(version);
						scanningResults.setPattern("镜像");
						//json地址
						listJson.add(outDirs+"sdk_result.json");
					} catch (IOException e) {
						e.printStackTrace();
					}
					
				}
			}
		}
		return listJson;
	}
	//项目地址
	public String getPath() {
		String path = this.getClass().getProtectionDomain().getCodeSource().getLocation().getPath();
		if (System.getProperty("os.name").contains("dows")) {
			path = path.substring(1, path.length());
		}
		if (path.contains("jar")) {
			path = path.substring(0, path.lastIndexOf("."));
			return path.substring(0, path.lastIndexOf("/"));
		}
		return path.replace("target/classes/", "");
	}

	/**
	 * 将版本号标准化处理、删去不符合规范的软件名称
	 */
	private static String versionStandard(String version) {
		version = version.replaceAll("[a-zA-Z]", "-");
		version = version.replaceAll("\"", "");
		if (version.contains("-")) {
			int index = version.indexOf("-");
			if (index == 0) {
				return version;
			}
			if (version.substring(index - 1, index).equals(".")) {
				version = version.substring(0, index - 1);
			} else {
				version = version.substring(0, index);
			}
		}
		if (version.contains("+")) {
			version = version.substring(0, version.indexOf("+"));
		}
		return version;
	}

	/**
	 * 读取json文件，返回json串
	 * @param fileName
	 * @return
	 */
	public static String readJsonFile(String fileName) {
		String jsonStr = "";
		try {
			File jsonFile = new File(fileName);
			FileReader fileReader = new FileReader(jsonFile);

			Reader reader = new InputStreamReader(new FileInputStream(jsonFile), "utf-8");
			int ch = 0;
			StringBuffer sb = new StringBuffer();
			while ((ch = reader.read()) != -1) {
				sb.append((char) ch);
			}
			fileReader.close();
			reader.close();
			jsonStr = sb.toString();
			return jsonStr;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}

	private static List<String> excuteCommand(String command) {
		Process process = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		List<String> list = new ArrayList<>();
		try {
			process = Runtime.getRuntime().exec(command);
			isr = new InputStreamReader(process.getInputStream(), "utf-8");
			br = new BufferedReader(isr);
			String line = null;
			while ((line = br.readLine()) != null) {
				list.add(line);
			}
			return list;
		} catch (Exception e) {
			try {
				if (process != null) {
					if (process.getInputStream() != null) {
						process.getInputStream().close();
					}
				}
			} catch (Exception ee) {
				ee.printStackTrace();
			}
		}
		return list;
	}
	public static void writeData(String filePath,String content){		
		try {    
		    File newFile = new File(filePath); // CSV数据文件  
		    BufferedWriter bw = new BufferedWriter(new FileWriter(newFile, true)); // 附加   
		    // 添加新的数据行 
		    bw.write(content);
		    bw.newLine();    
		    bw.close();    
		    }catch (FileNotFoundException e) {    
		      // File对象的创建过程中的异常捕获   
		    	e.printStackTrace();    
		    }catch (IOException e) {    
		      // BufferedWriter在关闭对象捕捉异常   
		    	e.printStackTrace();    
		    }    
		}
}
