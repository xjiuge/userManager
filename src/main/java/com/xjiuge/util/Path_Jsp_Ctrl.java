package com.xjiuge.util;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Path_Jsp_Ctrl {

	/**
	 * 主页
	 */
	@RequestMapping({"","/","index"})
	public String index(){
		System.out.println("index");
		return "index";
	}
	
	/**
	 * 去登录页面
	 */
	@RequestMapping("tologin")
	public String tologin(){
		return "login";
	}
	/**
	 * 去注册页面
	 */
	@RequestMapping("toreg")
	public String toreg(){
		return "reg";
	}
}
