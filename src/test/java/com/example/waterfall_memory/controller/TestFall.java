package com.example.waterfall_memory.controller;

import java.sql.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.waterfall_memory.dao.AnalyseDao;
import com.example.waterfall_memory.dao.FallDao;
import com.example.waterfall_memory.dto.AvilableCount;
import com.example.waterfall_memory.dto.FallNode;
import com.example.waterfall_memory.entity.Node;
import com.example.waterfall_memory.util.NoteResult;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestFall {
	@Autowired
	private FallController con;
	@Autowired
	private NodeController nodecon;
	
	@Test
	public void testFall() {
		NoteResult<List<FallNode>> nr = new NoteResult<List<FallNode>>();
		nr = con.inFall("qqq");
		nr.printJSON();	
	}
	@Test
	public void getMyNodes() {
		NoteResult<List<Node>> nr = new NoteResult<List<Node>>();
		nr = nodecon.getMyNodes("qqq");
		nr.printJSON();	
	}
	
	
}
