package com.ht.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ht.model.Plan;
import com.ht.service.PlanService_Admin;

@Controller
public class PlanController {

	@Autowired
	private PlanService_Admin planInstance;
	
	
	@RequestMapping("/plan")
	@ResponseBody
	public List<Plan> getFileLIst(){
		List<Plan> fileList=planInstance.getPlanList();
		return fileList;
	}
		
	
}
