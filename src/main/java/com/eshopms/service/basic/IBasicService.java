package com.eshopms.service.basic;

import java.io.Serializable;
import java.util.List;

import com.eshopms.util.MyException;

public interface IBasicService<T extends Serializable> {
	public void save(T t);

	public void update(T t);

	public void delete(int id);

	public T get(int id);

	public List<T> query(String queryString);
	//查询实例总数
	public Long getModelCount();
	//分页查询,自然排序
	public List<T> query(int firstResult, int maxResults, Class<T> classs);
	//分页查询,order by多字段排序,可以选择升降序
	public List<T> queryByOrder(int firstResult, int maxResults, String[] fileds,
			Class<T> classs, boolean[] dsc) throws MyException;
}
