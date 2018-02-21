package com.eshopms.service.basic;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public interface IBasicService<T extends Serializable,PK extends Serializable> {
	public void save(T t);

	public void update(T t);

	public void delete(PK id);

	public T get(PK id);

	public List<T> query(String queryString);
	
	public List<T> query(Class<T> classs);
	//按照字段查询
	public List<T> query(Class<T> classs, Map<String,String> kv);
	//查询实例总数
	public Long getModelCount();
	//分页查询,自然排序
	public List<T> query(int firstResult, int maxResults, Class<T> classs);
	//分页查询,order by多字段排序,可以选择升降序
	public List<T> queryByOrder(int firstResult, int maxResults, String[] fileds,
			Class<T> classs, boolean[] dsc);
}
