package com.example.waterfall_memory.controller;

import java.sql.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.waterfall_memory.service.FallService;
import com.example.waterfall_memory.util.NoteResult;

import ch.qos.logback.core.pattern.parser.Node;

@RestController
public class NodeController {
	@Resource
	private FallService service;
	
	@RequestMapping("/addNode.do")
	public NoteResult<Object> addNode(String uId,String wIdList) {
		NoteResult<Object> nr = new NoteResult<Object>();
		return nr;
	}
	
	@RequestMapping("/updateNode.do")
	public NoteResult<Object> updateNode(String uId,Node node) {
		NoteResult<Object> nr = new NoteResult<Object>();
		return nr;
	}
	
	@RequestMapping("/deleteNode.do")
	public NoteResult<Object> deleteNode(String uId,String wIdList) {
		NoteResult<Object> nr = new NoteResult<Object>();
		return nr;
	}

}
