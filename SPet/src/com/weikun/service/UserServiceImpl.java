package com.weikun.service;

import com.weikun.dao.IUserDAO;
import com.weikun.dao.UserDAOImpl;
import com.weikun.vo.Account;

public class UserServiceImpl implements IUserService {
	private IUserDAO dao=new UserDAOImpl();
	@Override
	public boolean login(Account account) {
		// TODO Auto-generated method stub
		return dao.login(account);
	}
	@Override
	public boolean addA(Account account) {
		// TODO Auto-generated method stub
		return dao.addA(account);
	}

}
