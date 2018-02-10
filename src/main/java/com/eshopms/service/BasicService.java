package com.eshopms.service;

import java.io.Serializable;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.eshopms.dao.basic.IBasicDao;
import com.eshopms.service.basic.IBasicService;
import com.eshopms.util.MyException;

@SuppressWarnings("unchecked")
public class BasicService<T extends Serializable> implements IBasicService<T> {
	@SuppressWarnings("rawtypes")
	@Autowired
	private IBasicDao iBasicDao;

	public void save(T t) {
		iBasicDao.save(t);
	}

	public void update(T t) {
		iBasicDao.save(t);
	}

	public void delete(int id) {
		iBasicDao.deleteByKey(id);
	}

	public T get(int id) {
		return (T) iBasicDao.get(id);
	}

	public List<T> query(String queryString) {
		return iBasicDao.find(queryString);
	}

	@Override
	public Long getModelCount() {
		return iBasicDao.getRowCount(iBasicDao.createDetachedCriteria());
	}

	@Override
	public List<T> query(int firstResult, int maxResults, Class<T> classs) {
		return iBasicDao.find("from "+classs.getName(), firstResult, maxResults);
	}

	@Override
	public List<T> queryByOrder(int firstResult, int maxResults,
			String[] fileds, Class<T> classs, boolean[] dsc) throws MyException {
		return iBasicDao.find("from "+classs.getName(), firstResult, maxResults, fileds, dsc);
	}

}
