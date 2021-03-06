package com.yz.bitedao.image.imageScan;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;


import com.alibaba.fastjson.JSONArray;
import com.yz.bitedao.report.InsertScanResultsVO;
import com.yz.bitedao.report.LoopholeResult.CveVO;
import com.yz.bitedao.report.LoopholeResult.LoopholetVO;
import com.yz.bitedao.report.ReportUtil;
import com.yz.bitedao.report.ScanningResults;

public class SupplyContent {

	static String sourcePath = "";
	static String outputPath = "";
	static String describeFilePath = "";
	static String scoreFilePath = "";
	static String chineseDescribePath = "";
	
	static HashMap<String, String> chineseDescribeHm = new HashMap<String, String>();
	static HashMap<String, String> describeHm = new HashMap<String, String>();
	static HashMap<String, String> scoreHm = new HashMap<String, String>();
	
	public static int main(String outDir , String describePath , String scorePath, String chineseDescribePaths, ScanningResults scanningResults) {
		sourcePath = outDir + "Loophole_image.csv";
		outputPath = outDir + "FinalResult_image.xls";
		describeFilePath = describePath;
		scoreFilePath = scorePath;
		chineseDescribePath=chineseDescribePaths;
    	//输出文件检查
        File outputFileOk = new File(outputPath);
        if (outputFileOk.exists()){
        	outputFileOk.delete();
        }
        try {
        	outputFileOk.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
			
		FileInputStream fis;
		//定义CVE描述hashMap1231asd
		String describe = "s";
		try {
			fis = new FileInputStream(describeFilePath);
			InputStreamReader isr =new InputStreamReader(fis,"UTF-8");
			BufferedReader br = new BufferedReader(isr);
			while((describe = br.readLine())!=null){   
				String describeTmp = describe.replaceAll("[\\t\\n\\r]", " ");
				int index = describeTmp.indexOf(" ");
				String keyString = describe.substring(0,index);
				int style = (int)Math.floor(Math.random() * 5);
				describeHm.put(keyString, describe.substring(index+1));
	        }
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//定义CVE评分hashMap
		String score = "";
		try {
			fis = new FileInputStream(scoreFilePath);
			InputStreamReader isr =new InputStreamReader(fis,"UTF-8");
			BufferedReader br = new BufferedReader(isr);
			while((score = br.readLine())!=null){   
				String scoreTmp = score.replaceAll("[\\t\\n\\r]", " ");
				int index = scoreTmp.indexOf(" ");
				String keyString = score.substring(0,index);
				scoreHm.put(keyString, score.substring(index+1));
	        }
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		// 定义汉化的cve描述
		String chineseDescribes = "";
		try {
			fis = new FileInputStream(chineseDescribePaths);
			InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
			BufferedReader br = new BufferedReader(isr);
			while ((describe = br.readLine()) != null) {
				String describeTmp = describe.replaceAll("[\\t\\n\\r]", " ");
				int index = describeTmp.indexOf(" ");
				String keyString = describe.substring(0, index);
				chineseDescribeHm.put(keyString, describe.substring(index + 1));
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		int addNum = 0;
		//提交服务器
		List<LoopholetVO> loopholetVOList = new ArrayList<>();
		//提交服务器
	    JSONArray dataOut = new JSONArray();
	    //漏洞列表
	    List<CveVO> cvrList=new  ArrayList<>();
	    dataOut.clear();
		try {
			fis = new FileInputStream(sourcePath);
			InputStreamReader isr =new InputStreamReader(fis,"UTF-8");
			BufferedReader br = new BufferedReader(isr);
			String result = "";

			while((result = br.readLine())!=null){
				String[] results = result.split(",");
				String cveNum = results[0];
				
				//优化表格
				String jh = results[0];
				results[0]=results[1];
				results[1]=jh;
				String jhs = results[1];
				results[1]=results[2];
				results[2]=jhs;
				
				String describeHmStr = describeHm.containsKey(cveNum) ? "\t" + describeHm.get(cveNum) : "\tLack of description";
				String chineseDescribeHmStr = chineseDescribeHm.containsKey(cveNum) ? "\t" + chineseDescribeHm.get(cveNum).trim() : "\tLack of description";
				String scoreHmStr = scoreHm.containsKey(cveNum) ? "\t" + scoreHm.get(cveNum) : "\tLack of score\tLack of score"; 
				addNum++;
				//漏洞信息
				cvrList.add(new CveVO(cveNum,describeHmStr.split("\t")[1],(scoreHmStr.trim().split("\t")[0]), scoreHmStr.trim().split("\t")[1],describeHmStr.split("\t")[2], chineseDescribeHmStr,results[0]));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		/**
		 * 结果原来提交服务器 现在本地生成
		 * 输出xls格式 sdsd
		 */
		try {
			FileOutputStream fileqs = new FileOutputStream(outputPath);
			fileqs.close();
		} catch (IOException e) {
		}
		
		System.out.println(addNum + " lines of vulnerability score have been written to [" + outputPath.replace("\\\\", "\\")+"]");
		

		//结果报告
		InsertScanResultsVO inscanvo = new InsertScanResultsVO();
		scanningResults.setScanningTime(new Date());
		inscanvo.setScanningResults(scanningResults);
		ReportUtil.reportResult(inscanvo, outDir);
		//结果原来提交服务器 现在本地生成
		//HttpclientUtils.requestByPostMethod(Constant.URL, insertScanResultsvoStr);
		return addNum;
		
    }  
	
		
}
