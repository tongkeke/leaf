package com.eshopms.dao;

import org.springframework.stereotype.Repository;

import com.eshopms.dao.basic.BasicDao;
import com.eshopms.dao.iface.IUserDao;
import com.eshopms.model.User;

@SuppressWarnings("unchecked")
@Repository("userDAO")
public class UserDAO extends BasicDao<User,Integer> implements IUserDao {
}