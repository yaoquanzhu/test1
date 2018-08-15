package com.yc.web.listeners;


import java.util.List;












import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.yc.bean.District;
import com.yc.bean.HouseType;
import com.yc.biz.DistrictBiz;
import com.yc.biz.HouseTypeBiz;



public class InitListener implements ServletContextListener {

	public InitListener(){
	}
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		ServletContext application = sce.getServletContext();
		//通过WebApplicationContextUtils  得到spring容器的实例
		ApplicationContext ac = WebApplicationContextUtils.getWebApplicationContext(application);
		//从spring容器中取tagBizImpl
		HouseTypeBiz houseTypeBiz = (HouseTypeBiz) ac.getBean("houseTypeBizImpl");
		List<HouseType> houseTypeList=houseTypeBiz.getTypeList();
		System.out.println(houseTypeList);
		application.setAttribute("houseTypeList", houseTypeList);
		DistrictBiz districtBiz=(DistrictBiz) ac.getBean("districtBizImpl");
		List<District> districtList=districtBiz.getDistrictList();
		application.setAttribute("districtList", districtList);
		System.out.println(districtList);
		
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
	}

	
}
