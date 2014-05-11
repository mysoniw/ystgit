package com.weikun.service;

import java.util.List;

import com.weikun.dao.CategoryDAOImpl;
import com.weikun.dao.ICategoryDAO;
import com.weikun.vo.Category;

public class CategoryServieImpl implements ICategoryService {
	private ICategoryDAO dao=new CategoryDAOImpl();
	@Override
	public List<Category> queryC() {
		// TODO Auto-generated method stub
		return dao.queryC()	;
	}

}
