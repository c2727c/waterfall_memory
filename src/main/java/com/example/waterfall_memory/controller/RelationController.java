package com.example.waterfall_memory.controller;

import java.sql.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.waterfall_memory.entity.Node;
import com.example.waterfall_memory.entity.Rela;
import com.example.waterfall_memory.service.FallService;
import com.example.waterfall_memory.service.RelaService;
import com.example.waterfall_memory.util.NoteResult;


@RestController
public class RelationController {
	@Resource
	private RelaService service;
	
	@RequestMapping("/addRela.do")
	public NoteResult<Object> addRela(Rela rela) {
		NoteResult<Object> nr = new NoteResult<Object>();
		try {
			nr.setAll(0,"success",service.addRela(rela));
		} catch (Exception e) {
			e.printStackTrace();
			nr.setAll(-1, "error", null);
		}
		return nr;
	}
	
	@RequestMapping("/deleteRela.do")
	public NoteResult<Object> deleteRela(Rela rela) {
		NoteResult<Object> nr = new NoteResult<Object>();
		try {
			nr.setAll(0,"success",service.deleteRela(rela));
		} catch (Exception e) {
			e.printStackTrace();
			nr.setAll(-1, "error", null);
		}
		return nr;
	}
	
	@RequestMapping("/relaWords.do")//返回相关词列表//1级/2级//关系
	public NoteResult<List<Node>> relaWords(String openId,String wId1) {
		NoteResult<List<Node>> nr = new NoteResult<List<Node>>();
		try {
			nr.setAll(0,"success",service.relaWords(openId,wId1));
		} catch (Exception e) {
			e.printStackTrace();
			nr.setAll(-1, "error", null);
		}
		return nr;
	}
	@RequestMapping("/relaWords2.do")//返回相关词列表//1级/2级//关系
	public NoteResult<Map<String,List<String>>> relaWords2(String openId,String wId1) {
		NoteResult<Map<String,List<String>>> nr = new NoteResult<Map<String,List<String>>>();
		try {
			nr.setAll(0,"success",service.relaWords2(openId,wId1));
		} catch (Exception e) {
			e.printStackTrace();
			nr.setAll(-1, "error", null);
		}
		return nr;
	}
	
	


}
