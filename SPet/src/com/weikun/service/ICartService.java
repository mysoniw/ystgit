package com.weikun.service;

import java.util.List;

import com.weikun.po.Cart;

public interface ICartService {
	public List<Cart> addCart(Cart cart,String username) ;
	 List<Cart> updateCart(Cart cart) ;

}
