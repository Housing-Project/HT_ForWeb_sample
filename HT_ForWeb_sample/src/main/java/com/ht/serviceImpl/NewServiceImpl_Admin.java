package com.ht.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ht.dao.NewDao_Admin;
import com.ht.model.New;
import com.ht.service.NewService_Admin;

@Service("NewService")
public class NewServiceImpl_Admin implements NewService_Admin{
	
	@Autowired
	private NewDao_Admin newDao;
	
	@Override
	public List<New> getNewList(){
		return newDao.getNewList();
	}
}
