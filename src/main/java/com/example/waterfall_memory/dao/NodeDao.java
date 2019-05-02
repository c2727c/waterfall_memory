package com.example.waterfall_memory.dao;

import java.util.List;

import com.example.waterfall_memory.entity.Node;
import com.example.waterfall_memory.util.NoteResult;

public interface NodeDao {

	public int addNode(List<Node> nl);

	public int updateNode(Node node);

	public int deleteNode(Node node);

}
