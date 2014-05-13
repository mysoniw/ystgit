package com.weikun.dao;

import java.util.List;

import com.weikun.vo.Category;
import com.weikun.vo.Product;

public interface IProductDAO {
	List<Product> queryC(Category category);
	
}	
