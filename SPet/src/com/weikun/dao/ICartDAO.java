package com.weikun.dao;

import java.util.List;

import com.weikun.vo.Cart;
import com.weikun.vo.Orders;

public interface ICartDAO {
	List<Cart> addCart(Cart cart);
    List<Cart> updateCart(Cart cart) ;
}
