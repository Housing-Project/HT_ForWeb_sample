package com.ht.dao;

import java.sql.SQLException;
import java.util.List;

import com.ht.model.New;

public interface NewDao_Admin {
	
	List<New> getNewList(int page) throws SQLException;
	
	int getNewNum() throws SQLException;
}
