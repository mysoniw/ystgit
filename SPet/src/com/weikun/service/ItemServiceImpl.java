package com.weikun.service;

import java.util.List;

import com.weikun.dao.IItemDAO;
import com.weikun.dao.ItemDAOImpl;
import com.weikun.po.Item;
import com.weikun.po.Product;

public class ItemServiceImpl implements IItemService {
	private IItemDAO dao=new ItemDAOImpl();
	@Override
	public List<Item> queryC(Product product) {
		// TODO Auto-generated method stub
		return dao.queryC(product);
	}
	@Override
	public Item queryI(String itemid) {
		// TODO Auto-generated method stub
		return dao.queryI(itemid);
	}

}
