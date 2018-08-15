package com.yc.dao;

import java.util.List;
import java.util.Map;

import com.yc.bean.House;

public interface BaseDao<T> {
	
	/**
	 * 要保存的数据对象
	 * @param t
	 * @param sqlId
	 */
	public void save(T clazz,String sqlId);
	
	/**
	 * 要保存的数据对象
	 * @param t
	 * @param sqlId
	 */
	public void save(Class<T> clazz,String sqlId,Map<String,Object> parameterMap);
	
	/**
	 * 要保存的数据对象
	 * @param t
	 * @param sqlId
	 */
	public void save(Class<T> clazz,String sqlId,List<T> list);
	
	
	/**
	 * 更新对象
	 * @param t
	 * @param sqlId
	 */
	public void update(Class<T> clazz,String sqlId);
	
	/**
	 * 更新对象
	 * @param t
	 * @param sqlId
	 */
	public void update(T t,String sqlId);
	/**
	 * 删除一条数据
	 * @param clazz：对象的反射实例，用于确认mapper文件位置
	 * @param ids :要删除的数据编号，它是一个集合   多个编号
	 * @param sqlId：mapper中方法名
	 */
	public void del(Class<T> clazz,String sqlId,String id);
	/**
	 * 
	 * @param t
	 * @param sqlId
	 */
	public void del(T t,String sqlId);
	/**
	 * 
	 * @param clazz
	 * @param sqlId
	 * @param parameterMap
	 */
	public void del(Class<T> clazz,String sqlId,Map<String,Object> parameterMap);
	/**
	 * 根据ids删除多条数据
	 * @param clazz
	 * @param ids
	 * @param sqlId
	 */
	public void del(Class<T> clazz,String sqlId,List<Object> ids);
	/**
	 * 查集合   没有条件属性
	 * @param clazz
	 * @param sqlId
	 * @return   集合
	 */
	public List<T> findAll(Class<T> clazz, String sqlId);
	
	/**
	 * 查集合  查询一条数据
	 * @param clazz：条件对象，用于确认mapper文件位置以及条件值
	 * @param sqlId
	 * @return
	 */
	public List<T> findAll(Class<T> clazz, String sqlId,Map<String,Object> parameterMap);

	/**
	 * 查集合  查询一条数据
	 * @param clazz：条件对象，用于确认mapper文件位置以及条件值
	 * @param sqlId
	 * @return
	 */
	public List<T> findAll(T t, String sqlId);
	/**
	 * 
	 * @param clazz
	 * @param sqlId
	 * @return
	 */
	public T findOne(T t, String sqlId);
	/**
	 * 
	 * @param clazz
	 * @param sqlId
	 * @return
	 */
	public T findOne(Class<T> clazz,String sqlId);
	/**
	 * 
	 * @param clazz
	 * @param sqlId
	 * @param parameterMap
	 * @return
	 */
	public T findOne(Class<T> clazz,String sqlId,Map<String,Object> parameterMap);
	

	
	
	/**
	 * 聚合查询
	 * @param clazz  ：用于确认文件的位置
	 * @param sqlId  ：mapper里面的方法名
	 * @return
	 */
	public double getFunc(T t, String sqlId);
	/**
	 * 聚合查询
	 * @param clazz  ：用于确认文件的位置
	 * @param sqlId  ：mapper里面的方法名
	 * @return
	 */
	public double getFunc(Class<T> clazz, String sqlId);
	/**
	 * 聚合查询
	 * @param clazz  ：用于确认文件的位置
	 * @param sqlId  ：mapper里面的方法名
	 * @return
	 */
	public int getFunc(Class<T> clazz, String sqlId,Map<String,Object> parameterMap);
	
}



