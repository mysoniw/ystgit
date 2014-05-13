package com.weikun.service;

import java.util.List;

import com.weikun.dao.IProductDAO;
import com.weikun.dao.ProductDAOImpl;
import com.weikun.vo.Category;
import com.weikun.vo.Product;

public class ProductServiceImpl implements IProductService {
	private IProductDAO dao=new ProductDAOImpl();
	@Override
	public List<Product> queryC(Category category) {
		// TODO Auto-generated method stub
		return dao.queryC(category);
	}

}
