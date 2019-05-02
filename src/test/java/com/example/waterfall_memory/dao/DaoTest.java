package com.example.waterfall_memory.dao;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.waterfall_memory.dto.AvilableCount;
import com.example.waterfall_memory.entity.Node;
import com.example.waterfall_memory.util.NoteResult;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DaoTest {
	@Autowired
	private AnalyseDao analyseDao;
	@Autowired
	private NodeDao nodeDao;
	@Autowired
	private FallDao fallDao;
	@Autowired
	private RelaDao relaDao;
	@Test
	public void testAnalyseDao() {
		List<AvilableCount> list = analyseDao.dailyAvilable2(Date.valueOf("2019-03-25"));
	}
	
	@Test
	public void addNode() {
		List<Node> nl = new ArrayList<Node>();
		nl.add(new Node("qqq","abacus"));
//		nl.add(new Node("qqq","abbreviation"));
		nodeDao.addNode(nl);
	}
	@Test
	public void updateNode() {
		Node n = new Node("qqq","abacus");
		n.setNtId("a");
		nodeDao.updateNode(n);
	}
	@Test
	public void deleteNode() {
		List<Node> nl = new ArrayList<Node>();
		nodeDao.deleteNode(new Node("qqq","abacus"));
	}
	@Test
	public void addRela() {
		List<Node> nl = new ArrayList<Node>();
		nl.add(new Node("qqq","abacus"));
//		nl.add(new Node("qqq","abbreviation"));
		nodeDao.addNode(nl);
	}
	@Test
	public void updateRela() {
		Node n = new Node("qqq","abacus");
		n.setNtId("a");
		nodeDao.updateNode(n);
	}
	@Test
	public void deleteRela() {
		List<Node> nl = new ArrayList<Node>();
		nodeDao.deleteNode(new Node("qqq","abacus"));
	}
	@Test
	public void relaWords() {
		List<Node> nl = new ArrayList<Node>();
		nodeDao.deleteNode(new Node("qqq","abacus"));
	}

}
