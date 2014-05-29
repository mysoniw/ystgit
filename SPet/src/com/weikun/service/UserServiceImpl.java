package com.weikun.service;

import com.weikun.dao.IUserDAO;
import com.weikun.dao.UserDAOImpl;


public class UserServiceImpl implements IUserService {
	private IUserDAO dao=new UserDAOImpl();
	@Override
	public boolean login(com.weikun.po.Account account) {
		// TODO Auto-generated method stub
		return dao.login(account);
	}
	@Override
	public boolean addA(com.weikun.po.Account account) {
		// TODO Auto-generated method stub
		return dao.addA(account);
	}

}
