package com.weikun.action;

import java.util.List;

import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

import com.opensymphony.xwork2.ActionSupport;
import com.weikun.service.IItemService;
import com.weikun.service.ItemServiceImpl;
import com.weikun.vo.Item;
import com.weikun.vo.Product;



@ParentPackage(value="struts-default")
@Namespace(value="/shop")
@Results({	
	@Result(name="success",location="/shop/viewProduct.jsp",type="dispatcher"),
	@Result(name="success1",location="/shop/viewItem.jsp",type="dispatcher")
	
})
public class ItemAction extends ActionSupport {
	private IItemService service=new ItemServiceImpl();
	private Product product;
	private Item item;
	
	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	private List<Item> ilist;
	
	public List<Item> getIlist() {
		return ilist;
	}

	public void setIlist(List<Item> ilist) {
		this.ilist = ilist;
	}

	public String queryP() throws Exception {
		// TODO Auto-generated method stub
		this.ilist=service.queryC(product);
		
		return "success";
	}
	public String queryI() throws Exception {
		
		item=service.queryI(item.getItemid());
		return "success1";
	}
}
