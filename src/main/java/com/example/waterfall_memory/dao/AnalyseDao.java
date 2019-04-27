package com.example.waterfall_memory.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.MapKey;

import com.example.waterfall_memory.dto.AvilableCount;
import com.example.waterfall_memory.dto.EChart;

import java.sql.Date;
import java.sql.Time;

public interface AnalyseDao {

//	@MapKey("count_point")
//	public Map<Time,Integer> dailyAvilable(Date day);
	
	public List<AvilableCount> dailyAvilable2(Date day);
	
//	@MapKey("count_point")
//	public int dailyAvilable3(Date day);
	
}
