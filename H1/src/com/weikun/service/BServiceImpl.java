package com.weikun.service;

import com.weikun.dao.BDAOImpl;
import com.weikun.dao.IBDAO;
import com.weikun.po.B;

public class BServiceImpl implements IBService {
	private IBDAO dao=new BDAOImpl();
	public static void main(String[] args) {
		B b=new B();
		b.setEId((byte)3);
		b.setEName("MIKE");
		new BServiceImpl().add(b);
	}
	@Override
	public void add(B b) {
		// TODO Auto-generated method stub
		dao.add(b);
	}

}
