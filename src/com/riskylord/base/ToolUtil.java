package com.riskylord.base;

import java.util.UUID;

import org.apache.log4j.Logger;

import com.riskylord.module.login.LoginController;

public class ToolUtil {
	private static Logger logger = Logger.getLogger(ToolUtil.class);
	/** 
     * 生成32位UUID 并去掉"-" 
     */  
    public static String getUUID() {  
        return UUID.randomUUID().toString().replaceAll("-", "");  
    }  
  
    public static void main(String[] args) {  
    	System.out.println(ToolUtil.getUUID());  
    	System.out.println(ToolUtil.getUUID().length());// 32  
    }  
}
