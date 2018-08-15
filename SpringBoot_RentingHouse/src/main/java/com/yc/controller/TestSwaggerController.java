package com.yc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

@Api(value="/test",tags="测试接口模块")
@RestController
@RequestMapping("/test")
public class TestSwaggerController {
	@ApiOperation(value="展示信息首页",notes="展示首页信息")
	@GetMapping("/show")
	public Object showInfo(){
		return "hello world";
	}
	
	@ApiOperation(value="添加信息首页",notes="添加首页信息")
	@ApiImplicitParam(name="user",value="User" ,required=true,dataType="User")
	@PostMapping("/addUser")
	public Object addUser(){
		return "hello add world";
	}
	
}
