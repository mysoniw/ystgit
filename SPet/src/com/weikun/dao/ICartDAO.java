package com.weikun.dao;

import java.util.List;

import com.weikun.po.Cart;
import com.weikun.po.Orders;

public interface ICartDAO {
	List<Cart> addCart(Cart cart);
    List<Cart> updateCart(Cart cart) ;
}
