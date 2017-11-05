package com.ht.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ht.dao.PlanDao_Admin;
import com.ht.model.Plan;
import com.ht.service.PlanService_Admin;

@Service("PlanService")
public class PlanServicelmpl_Admin implements PlanService_Admin{
	
	@Autowired
	private PlanDao_Admin planDao;

	@Override
	public List<Plan> getPlanList() {
		// TODO Auto-generated method stub
		return planDao.getPlanList();
	}
}
