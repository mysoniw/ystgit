package com.weikun.dao;

import java.util.List;

import com.weikun.vo.Category;
import com.weikun.vo.Item;
import com.weikun.vo.Product;

public interface IItemDAO {
	List<Item> queryC(Product product);
	Item queryI(String itemid);
}
