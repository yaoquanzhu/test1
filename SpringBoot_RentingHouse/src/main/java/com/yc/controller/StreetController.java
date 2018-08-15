package com.yc.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yc.bean.District;
import com.yc.bean.JsonModel;
import com.yc.bean.Street;
import com.yc.biz.DistrictBiz;

@RestController
public class StreetController {
	
	@Resource(name="districtBizImpl")
	private DistrictBiz districtBiz;
	
	@RequestMapping("street_list.action")
	public JsonModel street_list(District district){
		List<Street> list=this.districtBiz.getStreetByDistrictId(district.getId()   );
		System.out.println(list);
		JsonModel jm=new JsonModel();
		jm.setRows(list);
		return jm;
	}
}
