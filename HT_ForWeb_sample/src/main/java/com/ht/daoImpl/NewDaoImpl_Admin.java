package com.ht.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ht.dao.NewDao_Admin;
import com.ht.model.New;

@Repository
public class NewDaoImpl_Admin implements NewDao_Admin{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate){
		this.jdbcTemplate = jdbcTemplate;
	}
	
	@Override
	public List<New> getNewList(){
		String sql = "select * from new where newStatus=1 order by newId";
		List<New> newList = jdbcTemplate.query(sql, new BeanPropertyRowMapper(New.class));
		return newList;
	}
}
