package com.weikun.service;

import java.util.List;

import com.weikun.dao.CartDAOImpl;
import com.weikun.dao.ICartDAO;
import com.weikun.po.Cart;

public class CartServiceImpl implements ICartService {
	private ICartDAO dao=new CartDAOImpl();
	@Override
	public List<Cart> addCart(Cart cart,String username) {
		// TODO Auto-generated method stub
		return dao.addCart(cart,username);
	}
	@Override
	public List<Cart> updateCart(Cart cart) {
		// TODO Auto-generated method stub
		return dao.updateCart(cart);
	}
	

}
