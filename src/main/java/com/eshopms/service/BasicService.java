package com.eshopms.service;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.eshopms.dao.basic.IBasicDao;
import com.eshopms.service.basic.IBasicService;
public class BasicService<T extends Serializable, PK extends Serializable> implements IBasicService<T , PK> {
	@Autowired
	private IBasicDao<T,PK> iBasicDao;

	
	public void save(T t) {
		iBasicDao.save(t);
	}

	public void update(T t) {
		iBasicDao.save(t);
	}

	public void delete(PK id) {
		iBasicDao.deleteByKey(id);
	}

	public T get(PK id) {
		return (T) iBasicDao.get(id);
	}
	@Override
	public List<T> query(String queryString) {
		return iBasicDao.find(queryString);
	}
	public List<T> query(Class<T> classs) {
		return iBasicDao.find(classs);
	}

	public List<T> query(Class<T> classs, Map<String,String> kvs) {
		return iBasicDao.find(classs, kvs);
	}
	public List<T> query(int firstResult, int maxResults, Class<T> classs) {
		return iBasicDao.find("from "+classs.getName(), firstResult, maxResults);
	}
	@Override
	public Long getModelCount() {
		return iBasicDao.getRowCount(iBasicDao.createDetachedCriteria());
	}

	

	@Override
	public List<T> queryByOrder(int firstResult, int maxResults,
			String[] fileds, Class<T> classs, boolean[] dsc) {
		return iBasicDao.find("from "+classs.getName(), firstResult, maxResults, fileds, dsc);
	}

	

	

}
