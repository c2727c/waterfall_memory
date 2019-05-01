package com.example.waterfall_memory.controller;

import java.sql.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.waterfall_memory.dto.FallNode;
import com.example.waterfall_memory.service.AnalyseService;
import com.example.waterfall_memory.service.FallService;
import com.example.waterfall_memory.util.NoteResult;
@RestController
public class FallController {
	@Resource
	private FallService service;	
	//获取单词循环池//前端向后端请求所有正在记忆中的Node。（正在记忆中判断标准：记忆点数>0）
	@RequestMapping("/infall.do")
	public NoteResult<List<FallNode>> inFall(String uId) {
		String dateInString="2019-04-27";
		NoteResult<List<FallNode>> nr = new NoteResult<List<FallNode>>();
		try {
			nr.setAll(0,"success",service.getMyFall(uId, Date.valueOf(dateInString)));
		} catch (Exception e) {
			e.printStackTrace();
			nr.setAll(-1, "error", null);
		}
		return nr;
	}
	//当单词退出视线时，进行点数换算并更新到前台本地数据结构同时更新到数据库。//此时如果发现单词到时间了，则要将其从本地单词池移除。
	@RequestMapping("/outfall.do")
	public NoteResult<Object> outFall(String uId,String wId) {
		NoteResult<Object> nr = new NoteResult<Object>();
		return nr;
	}
	
	
	//打开详情页
	@RequestMapping("/wordDetail.do")
	public NoteResult wordDetail(String uId,String wId) {
		NoteResult<List<FallNode>> nr = new NoteResult<List<FallNode>>();
		return nr;
	}

}
