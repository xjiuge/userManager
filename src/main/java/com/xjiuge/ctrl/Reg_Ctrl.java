package com.xjiuge.ctrl;

import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.xjiuge.bean.User;
import com.xjiuge.service.UserService;
import com.xjiuge.util.JsonResult;
import com.xjiuge.util.Md5Util;

@Controller
public class Reg_Ctrl {

	@Autowired
	private UserService userService;
	
	@RequestMapping("reg")
	@ResponseBody
	public JsonResult reg(String username,String password){
		User user = new User();
		user.setUserName(username);
		user.setPassword(Md5Util.getMd5(password));
		List<User> listUser = userService.findByPorperty("userName",username,"password",password);
		if(listUser!=null && listUser.size()>0){
			return new JsonResult(500, "该用户名已存在");
		}
		userService.save(user);
		return JsonResult.success();
	}
	
	@RequestMapping("login")
	public String login(String username,String password,HttpSession httpSession){
		List<User> listUser = userService.findByPorperty("userName",username,"password",Md5Util.getMd5(password));
		if(listUser!=null && listUser.size()>0){
			httpSession.setAttribute("user", listUser.get(0));
			return "index";
		}
		return "login";
	}
}
