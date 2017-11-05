package com.ht.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ht.model.New;
import com.ht.service.NewService_Admin;

@Controller
public class NewController {
	
	@Autowired 
	private NewService_Admin newInstance;
	
	@RequestMapping("/new")
	@ResponseBody
	public List<New> getFileList(){
		List<New> fileList = newInstance.getNewList();
		return fileList;
	}
}
