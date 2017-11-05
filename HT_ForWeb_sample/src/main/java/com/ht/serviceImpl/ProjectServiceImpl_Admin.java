package com.ht.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ht.dao.ProjectDao_Admin;
import com.ht.model.Project;
import com.ht.service.ProjectService_Admin;

@Service("ProjectService")
public class ProjectServiceImpl_Admin implements ProjectService_Admin{
	
	@Autowired
	private ProjectDao_Admin projectDao;

	@Override
	public List<Project> getProjectList() {
		// TODO Auto-generated method stub
		return projectDao.getProjectList();
	}

}
