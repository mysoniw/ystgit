package com.weikun.action;

import java.util.List;

import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

import com.opensymphony.xwork2.ActionSupport;
import com.weikun.service.IProductService;
import com.weikun.service.ProductServiceImpl;
import com.weikun.vo.Category;
import com.weikun.vo.Product;



@ParentPackage(value="struts-default")
@Namespace(value="/shop")
@Results({	
	@Result(name="success",location="/shop/viewCategory.jsp",type="dispatcher")
	
})

public class ProductAction extends ActionSupport {
	private IProductService service=new ProductServiceImpl();
	private Category category;
	
	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
	private List<Product> plist;

	public List<Product> getPlist() {
		return plist;
	}

	public void setPlist(List<Product> plist) {
		this.plist = plist;
	}

	public String queryC() throws Exception {
		// TODO Auto-generated method stub
		plist=service.queryC(category);
		
		return "success";
	}
}
