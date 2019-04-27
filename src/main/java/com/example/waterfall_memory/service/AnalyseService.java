package com.example.waterfall_memory.service;

import java.sql.Date;
import java.sql.Time;
import java.util.List;
import java.util.Map;
import com.example.waterfall_memory.dto.EChart;
import com.example.waterfall_memory.util.NoteResult;

public interface AnalyseService {
	public NoteResult<EChart> dailyAvilable2(Date d);

}
