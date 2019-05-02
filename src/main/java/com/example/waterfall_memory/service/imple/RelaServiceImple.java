package com.example.waterfall_memory.service.imple;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.example.waterfall_memory.dao.NodeDao;
import com.example.waterfall_memory.dao.RelaDao;
import com.example.waterfall_memory.entity.Node;
import com.example.waterfall_memory.entity.Rela;
import com.example.waterfall_memory.service.RelaService;
@Service("relaService")
public class RelaServiceImple implements RelaService{
	@Resource
	private RelaDao dao;

	@Override
	public Object addRela(Rela rela) {
		
		return dao.addRela(rela);
	}

	@Override
	public Object deleteRela(Rela rela) {
		return dao.deleteRela(rela);
	}

	@Override
	public List<Node> relaWords(String openId, String wId1) {
		return dao.relaWords( openId, wId1);
	}

}
