package com.weikun.service;

import java.util.List;

import com.weikun.po.Item;
import com.weikun.po.Product;

public interface IItemService {
	public List<Item> queryC(Product product) ;
	public Item queryI(String itemid) ;
}
