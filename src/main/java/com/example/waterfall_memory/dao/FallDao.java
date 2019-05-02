package com.example.waterfall_memory.dao;

import java.time.LocalDate;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.example.waterfall_memory.dto.FallNode;

public interface FallDao {
	public List<FallNode> getMyFall(@Param("uId")String uId,@Param("date")LocalDate date);
}
