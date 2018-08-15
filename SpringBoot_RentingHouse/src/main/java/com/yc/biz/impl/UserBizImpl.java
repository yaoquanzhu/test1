package com.yc.biz.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yc.bean.User;
import com.yc.biz.UserBiz;
import com.yc.dao.BaseDao;
@Service
public class UserBizImpl implements UserBiz {

	@Resource(name = "baseDaoMybatisImpl")
	private BaseDao<User> baseDao;
	
	@Override
	public boolean register(User user) {
		baseDao.save(user, "saveUser");
		return true;
	}

	@Override
	public boolean validate(User user) {
		List<User> list=baseDao.findAll(user, "isUserExist");
		if(list!=null  && list.size()>0){
			return true;
		}
		return false;
	}

	@Override
	public User getUserById(Integer id) {
	User u=new User();
	u.setId(id);
	List<User> list=baseDao.findAll(u, "getUser");
	if(list!=null  &&list.size()>0){
		return list.get(0);
	}
	return null;
	}

	@Override
	public User login(User user) {
		List<User> list=baseDao.findAll(user, "getUserByLogin");
		if(list!=null  &&list.size()>0){
			return list.get(0);
		}
		return null;
		}

}
