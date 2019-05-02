package com.example.waterfall_memory.dao;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.example.waterfall_memory.dto.FallNode;
import com.example.waterfall_memory.entity.Node;
import com.example.waterfall_memory.entity.Word;

public interface FallDao {
	public List<FallNode> getMyFall(@Param("openId")String openId,@Param("time")LocalDateTime time);

	public int updateNode(Node node);

	public Word wordDetail(@Param("wId")String wId);
	
}
