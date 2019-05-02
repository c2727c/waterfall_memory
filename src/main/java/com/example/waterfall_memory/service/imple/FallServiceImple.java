package com.example.waterfall_memory.service.imple;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.example.waterfall_memory.dao.FallDao;
import com.example.waterfall_memory.dto.FallNode;
import com.example.waterfall_memory.entity.Node;
import com.example.waterfall_memory.entity.Word;
import com.example.waterfall_memory.service.FallService;
@Service("fallService")
public class FallServiceImple implements FallService{
	@Resource
	private FallDao dao;
	@Override
	public List<FallNode> getMyFall(String uId, LocalDateTime date) {
		
		return dao.getMyFall(uId, date);
	}
	@Override
	public int updateNode(Node node) {
		return dao.updateNode(node);
	}
	@Override
	public Word wordDetail(String wId) {
		return dao.wordDetail(wId);
	}

}
