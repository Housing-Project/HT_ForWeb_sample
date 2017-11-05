package com.ht.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ht.dao.PlanDao_Admin;
import com.ht.model.Plan;


@Repository
public  class PlanDaolmp_Admin implements PlanDao_Admin{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate)
	{
		this.jdbcTemplate=jdbcTemplate;
	}
	
	@Override
	public List<Plan> getPlanList() {
		// TODO Auto-generated method stub
		String sql="select * from plan";
		List<Plan> PlanList =jdbcTemplate.query(sql, new BeanPropertyRowMapper(Plan.class));
		return PlanList;
	}
	
}
