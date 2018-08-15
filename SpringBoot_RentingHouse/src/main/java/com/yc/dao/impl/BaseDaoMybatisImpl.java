package com.yc.dao.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import com.yc.dao.BaseDao;
@Repository(value="baseDaoMybatisImpl")
public class BaseDaoMybatisImpl<T>  implements
		BaseDao<T> {

	private final String MAPPERPATH="com.yc.dao.";
	
	private SqlSession sqlSession;
	//重写父类sqlSessionTemplate  方法实现注入sqlSessionTemplate
	//为什么要重写？如果不重写，则需要xml配置spring
	/*@Resource(name="sqlSession")
	 public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		super.setSqlSessionTemplate(sqlSessionTemplate);
	}*/
	
//	@Resource(name="sqlSession")
//	private SqlSessionTemplate sqlSession;
//	
//	public void setSqlSession(SqlSessionTemplate sqlSession) {
//		this.sqlSession = sqlSession;
//	}
	
	@Override
	public void save(T t, String sqlId) {
		sqlSession.insert(MAPPERPATH+t.getClass().getSimpleName()+"Mapper."+sqlId, t);
	}

	
	@Override
	public void save(Class<T> clazz, String sqlId, Map<String, Object> parameterMap) {
		sqlSession.insert(MAPPERPATH+clazz.getClass().getSimpleName()+"Mapper."+sqlId, parameterMap);
	}

	@Override
	public void save(Class<T> clazz, String sqlId, List<T> list) {
		sqlSession.insert(MAPPERPATH+clazz.getClass().getSimpleName()+"Mapper."+sqlId, list);
	}

	@Override
	public void update(Class<T> clazz, String sqlId) {
		sqlSession.update(MAPPERPATH+clazz.getSimpleName()+"Mapper."+sqlId);
		
	}
	
	
	@Override
	public void update(T t, String sqlId) {
		sqlSession.update(MAPPERPATH+t.getClass().getSimpleName()+"Mapper."+sqlId, t);
	}

	@Override
	public void del(Class<T> clazz, String sqlId, String id) {
		sqlSession.delete(MAPPERPATH+clazz.getSimpleName()+"Mapper."+sqlId, id);
	}

	@Override
	public void del(T t, String sqlId) {
		sqlSession.delete(MAPPERPATH+t.getClass().getSimpleName()+"Mapper."+sqlId, t);
		
	}

	@Override
	public void del(Class<T> clazz, String sqlId,
			Map<String, Object> parameterMap) {
		sqlSession.delete(MAPPERPATH+clazz.getSimpleName()+"Mapper."+sqlId, parameterMap);
	}

	@Override
	public void del(Class<T> clazz, String sqlId, List<Object> ids) {
		sqlSession.delete(MAPPERPATH+clazz.getSimpleName()+"Mapper."+sqlId,ids);
		
	}

	@Override
	public List<T> findAll(Class<T> clazz, String sqlId) {
		return sqlSession.selectList(MAPPERPATH+clazz.getSimpleName()+"Mapper."+sqlId);
	}

	
	@Override
	public List<T> findAll(Class<T> clazz, String sqlId, Map<String, Object> parameterMap) {
		return  sqlSession.selectList(MAPPERPATH+clazz.getSimpleName()+"Mapper."+sqlId,parameterMap);
	}

	@Override
	public List<T> findAll(T t, String sqlId) {
		return  sqlSession.selectList(MAPPERPATH+t.getClass().getSimpleName()+"Mapper."+sqlId,t);
	}

	@Override
	public T findOne(T t, String sqlId) {
		List<T> list=sqlSession.selectList(MAPPERPATH+t.getClass().getSimpleName()+"Mapper."+sqlId,t);
		if(list!=null && list.size()>0){
			return list.get(0);
		}else{
			return null;
		}
	}

	@Override
	public T findOne(Class<T> clazz, String sqlId) {
		List<T> list=sqlSession.selectList(MAPPERPATH+clazz.getSimpleName()+"Mapper."+sqlId);
		if(list!=null && list.size()>0){
			return list.get(0);
		}else{
			return null;
		}
	}

	@Override
	public T findOne(Class<T> clazz, String sqlId,
			Map<String, Object> parameterMap) {
		List<T> list=sqlSession.selectList(MAPPERPATH+clazz.getSimpleName()+"Mapper."+sqlId,parameterMap);
		if(list!=null && list.size()>0){
			return list.get(0);
		}else{
			return null;
		}
	}
	
	@Override
	public int getFunc(Class<T> clazz, String sqlId, Map<String, Object> parameterMap) {
		return sqlSession.selectOne(MAPPERPATH+clazz.getSimpleName()+"Mapper."+sqlId,parameterMap);
	}

	@Override
	public double getFunc(T t, String sqlId) {
		return sqlSession.selectOne(MAPPERPATH+t.getClass().getSimpleName()+"Mapper."+sqlId,t);
	}

	@Override
	public double getFunc(Class<T> clazz, String sqlId) {
		return sqlSession.selectOne(MAPPERPATH+clazz.getSimpleName()+"Mapper."+sqlId);
	}

	
	

}
