package com.yz.bitedao.image.imageScan.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class StreamHandler2 extends Thread {
	InputStream m_inputStream;
	String m_type;

	public StreamHandler2(InputStream is, String type) {
		this.m_inputStream = is;
		this.m_type = type;
	}

	@Override
	public void run() {
		InputStreamReader isr = null;
		BufferedReader br = null;
		try {
			// 设置编码方式，否则输出中文时容易乱码
			isr = new InputStreamReader(m_inputStream, "utf-8");
			br = new BufferedReader(isr);
			String line = null;
	        String str ="";
			while ((line = br.readLine()) != null) {
			}
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			try {
				isr.close();
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
