package com.example.waterfall_memory.service.imple;

import java.util.List;

import javax.annotation.Resource;

import com.example.waterfall_memory.dao.FallDao;
import com.example.waterfall_memory.dao.NodeDao;
import com.example.waterfall_memory.entity.Node;
import com.example.waterfall_memory.service.NodeService;
import com.example.waterfall_memory.util.NoteResult;

public class NodeServiceImple implements NodeService{
	@Resource
	private NodeDao dao;

	@Override
	public Object addNode(List<Node> nl) {
		// TODO Auto-generated method stub
		return dao.addNode(nl);
	}

	@Override
	public Object updateNode(Node node) {
		// TODO Auto-generated method stub
		return dao.updateNode(node);
	}

	@Override
	public Object deleteNode(List<Node> nl) {
		// TODO Auto-generated method stub
		return dao.deleteNode(nl);
	}

}
