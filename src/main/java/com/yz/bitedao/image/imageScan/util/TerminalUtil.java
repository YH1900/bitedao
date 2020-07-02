package com.yz.bitedao.image.imageScan.util;

import java.io.File;

/**
 * 批量扫描jar和war包工具类 通过findbugs命令，检测源码包漏洞，并声称同名xml结果文件
 * @author yz
 */
public class TerminalUtil {
	private static final String projectPath = System.getProperty("user.dir");
	private static final String separator = File.separator;
	// 提供node执行地址和dockerfile_lint执行地址
	private static String dockerfileLintPath = projectPath + separator + "dockerfile_lint" + separator + "bin"
			+ separator + "dockerfile_lint ";
	private static String nodeBinPath = projectPath + separator + "node" + separator + "bin" + separator + "node ";

	public static void dockerfileScan(String source, String out) {
		StringBuilder cmdCommand = new StringBuilder();
		cmdCommand.append(nodeBinPath + dockerfileLintPath + " -f " + source + " -j");
		System.out.println(cmdCommand.toString());
		excuteCommand(cmdCommand.toString(),out+separator+"dockerScanResult.out");
	}
	public static String indexTest(String test) {
		return test;
	}
	private static void excuteCommand(String command,String outFile) {
		Process process = null;
		try {
			process = Runtime.getRuntime().exec(command);
			// 3、等待批处理执行完毕
			StreamHandler errorStreamHandler = new StreamHandler(process.getErrorStream(), "500");
			errorStreamHandler.start();
			StreamHandler outputStreamHandler = new StreamHandler(process.getInputStream(), "200");
			outputStreamHandler.start();
			errorStreamHandler.join();
			outputStreamHandler.join();
			process.waitFor();

		} catch (Exception e) {
			try {
				if (process != null) {
					if (process.getErrorStream() != null) {
						process.getErrorStream().close();
					}

					if (process.getInputStream() != null) {
						process.getInputStream().close();
					}

					if (process.getOutputStream() != null) {
						process.getOutputStream().close();
					}
				}
			} catch (Exception ee) {
				ee.printStackTrace();
			}

		}

	}
}
