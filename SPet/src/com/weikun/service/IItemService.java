package com.weikun.service;

import java.util.List;

import com.weikun.vo.Item;
import com.weikun.vo.Product;

public interface IItemService {
	public List<Item> queryC(Product product) ;
	public Item queryI(String itemid) ;
}
