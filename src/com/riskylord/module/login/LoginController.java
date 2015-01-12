package com.riskylord.module.login;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.riskylord.base.Controller.BaseController;

@Controller
public class LoginController extends BaseController{
	private static Logger logger = Logger.getLogger(LoginController.class);  
	@Autowired
	LoginDao loginDao;
	@RequestMapping(value = "/Login")
	public String login(HttpServletRequest request,HttpServletResponse response,ModelMap modelMap) {
		modelMap.put("sayHello", "hello world");
		logger.info((loginDao.getUser()).size());
		return "page/index/index.jsp";
	}
}
