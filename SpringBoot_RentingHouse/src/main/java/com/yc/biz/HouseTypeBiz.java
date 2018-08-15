package com.yc.biz;

import java.util.List;

import com.yc.bean.HouseType;

public interface HouseTypeBiz {
	/**
	 * 查询所有的房屋类型
	 * @return
	 */
	public List<HouseType> getTypeList();
}
