package com.ht.dao;


import java.util.List;

import com.ht.model.DesignPic;
import com.ht.model.Plan;

public interface PlanDao_Admin {
	
	List<Plan> getPlanList();
	//int getcount()throws SQLException;
	//public List<Plan> FindList(int page,int count);
	//public int count();

	List<Plan> getPlanByFloorAndArea(double area, int floor);

	DesignPic getDesignByPlanIdAndTag(int id, int tag, int direct);
}
