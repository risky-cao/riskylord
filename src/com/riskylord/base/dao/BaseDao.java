package com.riskylord.base.dao;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.springframework.stereotype.Repository;

import com.ibatis.sqlmap.client.SqlMapClient;

@Repository
public abstract class BaseDao  extends SqlMapClientDaoSupport {
	/*
	@Resource(name = "sqlMapClient")
	private SqlMapClient sqlMapClient;
	
	 @PostConstruct        
	 public void initSqlMapClient(){
	  super.setSqlMapClient(sqlMapClient);    
	 }*/
}
