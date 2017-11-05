package com.ht.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ht.model.Project;
import com.ht.service.ProjectService_Admin;

@Controller
public class ProjectController {

	@Autowired 
	private ProjectService_Admin projectInstance;
	
	
	@RequestMapping("/project")
	@ResponseBody
	public List<Project> getFileList(){
		List<Project> fileList=projectInstance.getProjectList();
		return fileList;
	}
}
