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
	//获取单词循环池
	@RequestMapping("/myfall.do")
	public NoteResult<List<FallNode>> getMyFall(String uId,String dateInString) {
		NoteResult<List<FallNode>> nr = new NoteResult<List<FallNode>>();
		try {
			nr.setAll(0,"success",service.getMyFall(uId, Date.valueOf(dateInString)));
		} catch (Exception e) {
			e.printStackTrace();
			nr.setAll(-1, "error", null);
		}
		return nr;
	}
	
	//打开详情页
	@RequestMapping("/wordDetail.do")
	public NoteResult wordDetail(String uId,String word) {
		NoteResult<List<FallNode>> nr = new NoteResult<List<FallNode>>();
		return nr;
	}

}
