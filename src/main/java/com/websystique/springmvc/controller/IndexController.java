package com.websystique.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
//@RequestMapping("/")
public class IndexController {

	   //@RequestMapping(method = RequestMethod.GET)
	@RequestMapping("/home")
	    public String getIndexPage() {
	        return "UserManagement";
	    }

}