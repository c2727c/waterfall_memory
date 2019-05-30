package com.example.waterfall_memory.service;

import java.util.List;
import java.util.Map;

import com.example.waterfall_memory.entity.Node;
import com.example.waterfall_memory.entity.Rela;
import com.example.waterfall_memory.util.NoteResult;

public interface RelaService {
	public Object addRela(Rela rela);

	public Object deleteRela(Rela rela);

	public List<Node> relaWords(String openId, String wId1);
	public Map<String,List<String>> relaWords2(String openId, String wId1);

}
