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
public class RelationController {
	@Resource
	private FallService service;
	
	@RequestMapping("/addRela.do")
	public NoteResult<Object> addRela(String uId,String wId,String wIdList,String rType) {
		NoteResult<Object> nr = new NoteResult<Object>();
		return nr;
	}
	
	@RequestMapping("/deleteRela.do")
	public NoteResult<Object> deleteRela(String uId,String wId,String wIdList,String rType) {
		NoteResult<Object> nr = new NoteResult<Object>();
		return nr;
	}


}
