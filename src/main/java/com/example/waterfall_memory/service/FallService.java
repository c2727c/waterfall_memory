package com.example.waterfall_memory.service;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import com.example.waterfall_memory.dto.EChart;
import com.example.waterfall_memory.dto.FallNode;
import com.example.waterfall_memory.entity.Node;
import com.example.waterfall_memory.entity.Word;
import com.example.waterfall_memory.util.NoteResult;

public interface FallService {
	public List<FallNode> getMyFall(String uId,LocalDateTime date);
	
	public int updateNode(Node node);

	public Word wordDetail(String wId);

}
