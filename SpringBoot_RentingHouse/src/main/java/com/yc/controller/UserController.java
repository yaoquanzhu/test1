package com.yc.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.yc.bean.JsonModel;
import com.yc.bean.User;
import com.yc.biz.UserBiz;
@Api(value="/user",tags="用户模块")
@Controller      //类注解  同时使用@Controller  和@ResponseBody
public class UserController {
	@Resource(name="userBizImpl")
	private UserBiz userBiz;
	
	@RequestMapping("/user_register.action")
	@ResponseBody
	public JsonModel register(User user){
		JsonModel jm=new JsonModel();
		boolean result=userBiz.register(user);
		System.out.println(result);
		if(result){
			jm.setCode(1);
		}else{
			jm.setCode(0);
		}
		return jm;
	}
	@ApiOperation(value="用户登录",notes="用户登录")
	@ApiImplicitParam(name="user",value="User" ,required=true,dataType="User")
	//@RequestMapping("/user_login.action")
	@PostMapping("/user_login.action")
	@ResponseBody
	public ModelAndView login(User user,HttpServletRequest request,HttpSession session){
		ModelAndView mav=new ModelAndView();
		String zccode=request.getParameter("zccode");
		String rand=session.getAttribute("rand").toString();
		if(!rand.equals(zccode)){
			request.setAttribute("errormsg", "验证码错误");
			
		}else{
			user=userBiz.login(user);
			if(user!=null){
				session.setAttribute("user", user);
				mav.setViewName("list");
				return mav;
			}else{
				request.setAttribute("errormsg", "用户名或密码错误");
			}
		}
		mav.setViewName("login");
		return mav;
	}
	
	
	@RequestMapping("/user_logout.action")
	public void logout(HttpSession session,HttpServletResponse resp){
		ModelAndView mav=new ModelAndView();
		session.removeAttribute("user");
		try {
			resp.sendRedirect("index.action");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
//	@RequestMapping("/user_logout.action")
//	public ModelAndView logout(HttpSession session){
//		ModelAndView mav=new ModelAndView();
//		session.removeAttribute("user");
//		mav.setViewName("login");
//		return mav;
//	}
}
