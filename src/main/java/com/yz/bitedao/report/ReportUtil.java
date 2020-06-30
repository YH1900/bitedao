package com.yz.bitedao.report;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import Submitted.entity.InsertScanResultsVO;
import Submitted.entity.LoopholetVO;
import Submitted.entity.ScanningResults;
import report.LoopholeResult.CveVO;
import report.LoopholeResult.LevelVO;
import report.LoopholeResult.LoopholeAndCveResultVO;
import report.LoopholeResult.LoopholeResultVO;

/**
 * @author yz
 *  报表生成
 */
public class ReportUtil {
	public static void reportResult(InsertScanResultsVO inscanvo, String outDir) {
		// 原结果文件夹增加json文件
		String resultJsonPath = outDir + "sdk_result.json";
		File outputFileOk = new File(resultJsonPath);
		if (outputFileOk.exists()) {
			outputFileOk.delete();
		}
		try {
			outputFileOk.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		// 构建结果
		LoopholeAndCveResultVO lpr = new LoopholeAndCveResultVO();
		// 程序信息
		ScanningResults scv = inscanvo.getScanningResults();
		if (scv.getEdition().equals("#")) {
			scv.setEdition("暂无");
		}
		if (scv.getPattern().equals("apk_c")) {
			scv.setPattern("安卓");
		}
		if (scv.getPattern().equals("apk_b")) {
			scv.setPattern("安卓");
		}
		if (scv.getPattern().equals("apk_a")) {
			scv.setPattern("安卓");
		}
		if (scv.getPattern().equals("apk_a")) {
			scv.setPattern("安卓");
		}
		if (scv.getPattern().equals("java")) {
			scv.setPattern("Java");
		}
		if (scv.getPattern().equals("python")) {
			scv.setPattern("Python");
		}
		scv.setRemark(" <button type=\"button\" class=\"layui-btn  layui-btn-sm\" lay-event=\"look\">查看</button>");
		lpr.setScanningResults(scv);
		lpr.setCveVOList(inscanvo.getCvelist());
		// 漏洞map 分等级用
		Map<String, List<CveVO>> cvevoMap = new HashMap<>();
		Map<String,LoopholetVO> lpsM = new HashMap<>();
		for (CveVO cvevos : inscanvo.getCvelist()) {
			String belongSDK = cvevos.getBelongSDK().trim();
			List<CveVO> cvelist = new ArrayList<>();
			if (cvevoMap.containsKey(belongSDK)) {
				cvelist = cvevoMap.get(belongSDK);
				cvelist.add(cvevos);
				cvevoMap.put(belongSDK, cvelist);
			} else {
				cvelist.add(cvevos);
				cvevoMap.put(belongSDK, cvelist);
			}

		}
		for (LoopholetVO loopholetVO : inscanvo.getLoopholetVOList()) {
			String name =loopholetVO.getName();
			if (!lpsM.containsKey(name)) {
				lpsM.put(name, loopholetVO);
			} 
		}
		ArrayList<LoopholeResultVO> loopholeResultVOs = new ArrayList<>();
		for (Map.Entry<String, List<CveVO>> entry : cvevoMap.entrySet()) {
			List<CveVO> cveVOs = entry.getValue();
			// 漏洞安全等级
			String loopholeLevel = "安全";
			// 不同等级漏洞个数
			LevelVO levelVO = new LevelVO();
			int HIGHnum = 0;
			int MEDIUMnum = 0;
			int LOWnum = 0;
			for (CveVO cveVO : cveVOs) {
				String cveVOlevel = cveVO.getVulnerabilityLevel();
				if (cveVOlevel.equals("HIGH")) {
					HIGHnum++;
				}
				if (cveVOlevel.equals("MEDIUM")) {
					MEDIUMnum++;
				}
				if (cveVOlevel.equals("LOW")) {
					LOWnum++;
				}

			}
			levelVO.setHeiNum(HIGHnum);
			levelVO.setLowNum(LOWnum);
			levelVO.setMedNum(MEDIUMnum);
			if (LOWnum > 0 && HIGHnum == 0 && MEDIUMnum == 0) {
				loopholeLevel = "低危";
			}
			if (HIGHnum > 0) {
				loopholeLevel = "高危";
			}
			if (HIGHnum == 0 && MEDIUMnum > 0) {
				loopholeLevel = "中危";
			}
			loopholeResultVOs.add(new LoopholeResultVO(lpsM.get(entry.getKey()), loopholeLevel, levelVO));
		}
		lpr.setLoopholeResultVOS(loopholeResultVOs);
		try {
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outputFileOk),"utf-8"));
			bw.write(JSON.toJSONString(lpr));
            bw.flush();
            bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
