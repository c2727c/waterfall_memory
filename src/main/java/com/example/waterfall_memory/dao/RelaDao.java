package com.example.waterfall_memory.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.example.waterfall_memory.entity.Node;
import com.example.waterfall_memory.entity.Rela;

public interface RelaDao {

	public Object addRela(Rela rela);

	public Object deleteRela(Rela rela);

	public List<Node> relaWords(@Param("openId")String openId, @Param("wId1")String wId1);

}
