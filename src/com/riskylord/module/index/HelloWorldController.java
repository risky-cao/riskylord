package com.riskylord.module.index;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
	private static Logger logger = Logger.getLogger(HelloWorldController.class);  
	@RequestMapping(value = "/hello")
	public String sayHello(ModelMap modelMap) {
		logger.info("111111111111111111");
		modelMap.put("sayHello", "hello world");
		return "hello.jsp";
	}
}
