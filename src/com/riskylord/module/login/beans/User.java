package com.riskylord.module.login.beans;

import java.io.Serializable;
import java.util.Date;

import org.springframework.stereotype.Repository;

@Repository
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7214992119444477781L;

	String username;
	String realname;
	String passwd;
	String birthday;
	String email;
	String remark1;
	String remark2;
	String remark3;
	String remark4;
	String remark5;
	String remark6;
	String remark7;
	String remark8;
	String remark9;
	String createby;
	Date createdt;
	String updateby;
	Date updatedt;

	@Override
	public String toString() {
		return "User [username=" + username + ", realname=" + realname + ", passwd=" + passwd + ", birthday=" + birthday + ", email=" + email + ", createby=" + createby + ", createdt=" + createdt + ", updateby=" + updateby +", updatedt=" + updatedt + "]\n";
	}

}
