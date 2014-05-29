package com.weikun.dao;

import com.weikun.vo.Account;

public interface IUserDAO {
	boolean login(com.weikun.po.Account account);
	boolean addA(com.weikun.po.Account account);
}
