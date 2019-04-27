package com.example.waterfall_memory.service.imple;

import java.sql.Date;
import java.sql.Time;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.example.waterfall_memory.dao.AnalyseDao;
import com.example.waterfall_memory.dto.AvilableCount;
import com.example.waterfall_memory.dto.EChart;
import com.example.waterfall_memory.service.AnalyseService;
import com.example.waterfall_memory.util.NoteResult;
@Service("analyseService")
public class AnalyseServiceImple implements AnalyseService{
	@Resource
	private AnalyseDao analyseDao;
		
	public NoteResult<EChart> dailyAvilable2(Date date) {
		List<AvilableCount> lav;
		lav = analyseDao.dailyAvilable2(date);
		NoteResult<EChart> result = 
				new NoteResult<EChart>(0,"成功",new EChart(lav));
		return result;
	}

}
