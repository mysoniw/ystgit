package com.weikun.dao;

import com.weikun.vo.Account;

public interface IUserDAO {
	boolean login(Account account);
	boolean addA(Account account);
}
