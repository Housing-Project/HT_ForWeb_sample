package com.ht.service;

import java.util.List;

import com.ht.model.DesignPic;
import com.ht.model.Plan;

public interface PlanService_Admin {
	
	List<Plan> getPlanList();

	List<Plan> getPlanByFloorAndArea(double area, int floor);

	DesignPic getDesignByPlanIdAndTag(int id, int tag, int direct);
}

