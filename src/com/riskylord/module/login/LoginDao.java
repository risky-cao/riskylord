package com.riskylord.module.login;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.SqlMapClientTemplate;
import org.springframework.stereotype.Repository;

import com.riskylord.base.dao.BaseDao;

@Repository
public class LoginDao extends BaseDao {
	
	@Autowired
	public LoginDao(SqlMapClientTemplate sqlMapClientTemplate) {
		super.setSqlMapClientTemplate(sqlMapClientTemplate);
	}
	
	public List getUser(){
		 List l = super.getSqlMapClientTemplate().queryForList("queryUser");
		 return l;
	 }

}
