package com.weikun.dao;

import java.util.List;

import com.weikun.po.Category;
import com.weikun.po.Product;

public interface IProductDAO {
	List<Product> queryC(Category category);
	
}	
