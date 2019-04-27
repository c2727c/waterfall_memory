package com.example.waterfall_memory.controller;

import java.sql.Date;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.*;

import com.example.waterfall_memory.dto.EChart;
import com.example.waterfall_memory.service.AnalyseService;
import com.example.waterfall_memory.util.NoteResult;

@RestController//Controller+ResponseBody
public class HelloController {
	@Resource
	private AnalyseService analyseService;
	
	@RequestMapping(name="/hello",method=RequestMethod.GET)
	public NoteResult<EChart> hello() {
		String dateInString = "2019-03-25";
		NoteResult<EChart> result;
		Date date = Date.valueOf(dateInString);
		result = analyseService.dailyAvilable2(date);
		return result;
	}
//	@RequestMapping(name="/eee",method=RequestMethod.GET)
//	public String helloee() {
//		return "Hello SpringBoot1111111";
//	}
}
