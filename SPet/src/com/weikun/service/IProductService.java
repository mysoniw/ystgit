package com.weikun.service;

import java.util.List;

import com.weikun.vo.Category;
import com.weikun.vo.Product;

public interface IProductService {
	public List<Product> queryC(Category category) ;
}
