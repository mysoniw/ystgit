package com.weikun.service;

import java.util.List;

import com.weikun.po.Category;
import com.weikun.po.Product;

public interface IProductService {
	public List<Product> queryC(Category category) ;
}
