package com.yc.biz.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yc.bean.House;
import com.yc.bean.JsonModel;
import com.yc.biz.HouseBiz;
import com.yc.dao.BaseDao;

@Service
public class HouseBizImpl implements HouseBiz {

	@Resource(name = "baseDaoMybatisImpl")
	private BaseDao<House> baseDao;

	@Override
	public House getHouseBean(House hb) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("id", hb.getId() + "");
		List<House> list = (List<House>) this.baseDao.findAll(hb, "findHouseCondition");
		if (list != null && list.size() > 0) {
			return list.get(0);
		} else {
			return null;
		}
	}

	@Override
	public boolean addHouse(House house) {
		baseDao.save(house, "saveHouse");
		return true;
	}

	@Override
	public boolean updateHouse(House house) {
		baseDao.update(house, "updateHouse");
		return true;
	}

	@Override
	public boolean delHouse(int id) {
		baseDao.del(House.class, "delSingleHouse", id + "");
		return true;
	}

	@Override
	public boolean delHouses(List<Integer> ids) {
		baseDao.del(House.class, ids+"", "delMutilHouse");
		return false;
	}

	@Override
	public JsonModel<House> searchHouse(Map<String, Object> map) {
		List<House> list = baseDao.findAll(House.class, 
				"findHouseCondition",map);
		//System.out.println(list);
		int total =  baseDao.getFunc(House.class, 
				"findHouseConditionCount",map);
		//System.out.println(total);
		JsonModel<House> jsonModel = new JsonModel<House>();
		jsonModel.setRows(list);
		//System.out.println(list);
		jsonModel.setTotal(total);
		jsonModel.setPages(Integer.parseInt(map.get("pages").toString()));
		jsonModel.setPageSize(Integer.parseInt(map.get("pagesize").toString()));
		
//		System.out.println(jsonModel);
		return jsonModel;
	}

}
