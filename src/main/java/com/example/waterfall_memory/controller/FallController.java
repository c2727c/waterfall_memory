package com.example.waterfall_memory.controller;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.waterfall_memory.dto.FallNode;
import com.example.waterfall_memory.entity.Node;
import com.example.waterfall_memory.entity.Word;
import com.example.waterfall_memory.service.AnalyseService;
import com.example.waterfall_memory.service.FallService;
import com.example.waterfall_memory.util.NoteResult;
@RestController
public class FallController {
	@Resource
	private FallService service;	
	//获取单词循环池//前端向后端请求所有正在记忆中的Node。（正在记忆中判断标准：记忆点数>0）
	@RequestMapping("/infall.do")
	public NoteResult<List<FallNode>> inFall(String openId) {
		LocalDateTime time = LocalDateTime.of(2019, 5, 2, 16, 10, 00);//LocalDate.now();//FIXME 
		NoteResult<List<FallNode>> nr = new NoteResult<List<FallNode>>();
		try {
			nr.setAll(0,"success",service.getMyFall(openId, time));
		} catch (Exception e) {
			e.printStackTrace();
			nr.setAll(-1, "error", null);
		}
		return nr;
	}
	
	//当单词退出视线时，进行点数换算并更新到前台本地数据结构同时更新到数据库。//此时如果发现单词到时间了，则要将其从本地单词池移除。
	@RequestMapping("/outfall.do")
	public NoteResult<Object> outFall(Node node) {
		NoteResult<Object> nr = new NoteResult<Object>();
		try {
			nr.setAll(0,"success",service.updateNode(node));
		} catch (Exception e) {
			e.printStackTrace();
			nr.setAll(-1, "error", null);
		}
		return nr;
	}
	//打开详情页
	@RequestMapping("/wordDetail.do")
	public NoteResult<Word> wordDetail(String wId) {
		NoteResult<Word> nr = new NoteResult<Word>();
		try {
			nr.setAll(0,"success",service.wordDetail(wId));
		} catch (Exception e) {
			e.printStackTrace();
			nr.setAll(-1, "error", null);
		}
		return nr;
	}

}
