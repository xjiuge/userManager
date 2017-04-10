package com.xjiuge.util;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Path_Jsp_Ctrl {

	
	@RequestMapping({"","/","index"})
	public String index(){
		System.out.println("index");
		return "index";
	}
	
	
	@RequestMapping("tologin")
	public String tologin(){
		return "login";
	}
	@RequestMapping("toreg")
	public String toreg(){
		return "reg";
	}
}
