package com.eshopms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.eshopms.dao.UserDAO;
import com.eshopms.model.User;
import com.eshopms.service.iface.IUserService;

@Service("userService")
public class UserService extends BasicService<User> implements IUserService {

	@Autowired
	private UserDAO userDAO;
}
	