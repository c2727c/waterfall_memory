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
import com.example.waterfall_memory.util.NoteResult;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestFall {
	@Autowired
	private FallController con;
	
	@Test
	public void testFall() {
		NoteResult<List<FallNode>> nr = new NoteResult<List<FallNode>>();
		nr = con.getMyFall("qqq", "2019-04-27");
		nr.printJSON();	
	}
	
	//怎么实现适时加入瀑布、适时退出瀑布？
	//每次用户对结点进行向后拖拽操作，就会导致其退出瀑布时间延长（修改nEnd）。
	//对结点进行向前拖拽、手动翻牌操作，导致其退出瀑布时间提前。
	//近期推拽次数和总拖拽次数的不同
	//在退出（到达退出时间时），应设置其下一次进入瀑布时间和退出瀑布时间
		//选择所有退出时间在当前时间之前的结点，对它们进行重安排
	

}
