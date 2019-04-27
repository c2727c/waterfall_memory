package com.example.waterfall_memory.dao;

import java.sql.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.waterfall_memory.dto.AvilableCount;
import com.example.waterfall_memory.util.NoteResult;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AnalyseDaoTest {
	@Autowired
	private AnalyseDao analyseDao;
	
	@Test
	public void testAnalyseDao() {
		List<AvilableCount> list = analyseDao.dailyAvilable2(Date.valueOf("2019-03-25"));
//		NoteResult<List<AvilableCount>> nr = new NoteResult<List<AvilableCount>>();
//		nr.setData(list);
//		nr.printJSON();
	}

}
