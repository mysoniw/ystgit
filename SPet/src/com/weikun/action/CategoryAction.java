package com.weikun.action;

import java.util.List;

import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

import com.opensymphony.xwork2.ActionSupport;
import com.weikun.service.CategoryServieImpl;
import com.weikun.service.ICategoryService;
import com.weikun.po.Category;
@ParentPackage(value="struts-default")
@Results({
	
	@Result(name="query",type="dispatcher",location="/"),
	
})
public class CategoryAction extends ActionSupport {
	private ICategoryService service=new CategoryServieImpl();
	private List<Category> list;
	
	public List<Category> getList() {
		return list;
	}

	
	
	public String query() throws Exception {
		// TODO Auto-generated method stub
		list=service.queryC();
				
		
		
		return "";
	}
}	
