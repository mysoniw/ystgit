package com.weikun.dao;

import java.util.List;

import com.weikun.vo.Category;
import com.weikun.po.Item;
import com.weikun.po.Product;

public interface IItemDAO {
	List<Item> queryC(Product product);
	Item queryI(String itemid);
}
