package com.example.waterfall_memory.service;

import java.util.List;

import com.example.waterfall_memory.entity.Node;
import com.example.waterfall_memory.util.NoteResult;

public interface NodeService {

	public Object addNode(List<Node> nl);

	public Object updateNode(Node node);

	public Object deleteNode(List<Node> nl);

}
