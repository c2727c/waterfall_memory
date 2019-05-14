package com.example.waterfall_memory.controller;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.waterfall_memory.dto.FallNode;
import com.example.waterfall_memory.entity.Node;
import com.example.waterfall_memory.service.FallService;
import com.example.waterfall_memory.service.NodeService;
import com.example.waterfall_memory.util.NoteResult;

@RestController
public class NodeController {
	@Resource
	private NodeService service;
	
	
	@RequestMapping("/getMyNodes.do")
	public NoteResult<List<Node>> getMyNodes(String openId) {

		NoteResult<List<Node>> nr = new NoteResult<List<Node>>();
		try {
			nr.setAll(0,"success",service.getMyNodes(openId));
		} catch (Exception e) {
			e.printStackTrace();
			nr.setAll(-1, "error", null);
		}
		return nr;
	}
	
	@RequestMapping("/addNode.do")
	public NoteResult<Object> addNode(String openId,String wIdList) {
		String[] wIds = wIdList.split(",");
		List<Node> nl = new ArrayList<Node>();
		for(String wId:wIds) {
			nl.add(new Node(openId,wId));
		}
		NoteResult<Object> nr = new NoteResult<Object>();
		try {
			nr.setAll(0,"success",service.addNode(nl));
		} catch (Exception e) {
			e.printStackTrace();
			nr.setAll(-1, "error", null);
		}
		return nr;
	}
	
	@RequestMapping("/updateNode.do")
	public NoteResult<Object> updateNode(Node node) {
		NoteResult<Object> nr = new NoteResult<Object>();
		try {
			nr.setAll(0,"success",service.updateNode(node));
		} catch (Exception e) {
			e.printStackTrace();
			nr.setAll(-1, "error", null);
		}
		return nr;
	}
	
	@RequestMapping("/deleteNode.do")
	public NoteResult<Object> deleteNode(String openId,String wIdList) {
		String[] wIds = wIdList.split(",");
		List<Node> nl = new ArrayList<Node>();
		for(String wId:wIds) {
			nl.add(new Node(openId,wId));
		}
		NoteResult<Object> nr = new NoteResult<Object>();
		try {
			nr.setAll(0,"success",service.deleteNode(nl));
		} catch (Exception e) {
			e.printStackTrace();
			nr.setAll(-1, "error", null);
		}
		return nr;
	}

}
