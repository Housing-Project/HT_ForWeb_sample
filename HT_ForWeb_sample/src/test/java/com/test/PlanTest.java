package com.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.ht.model.DesignPic;
import com.ht.model.Plan;
import com.ht.service.PlanService_Admin;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:springContext.xml"})
@WebAppConfiguration("src/main/resources")

public class PlanTest {
	@Autowired
	private PlanService_Admin PlanInstance;
	
	@Test
	public void getPlanList(){
		List<Plan> PlanList = PlanInstance.getPlanList();
		System.out.println("PlanList-->" +PlanList);
	}
	@Test
	public void getPlanList1(){
		List<Plan> PlanList = PlanInstance.getPlanByFloorAndArea(60, 2);
		System.out.println("PlanList-->" +PlanList);
	}
	@Test
	public void getPlanList2(){
		DesignPic  s= PlanInstance.getDesignByPlanIdAndTag(1, 1, 1);
		System.out.println("PlanList-->" +s);
	}
}
