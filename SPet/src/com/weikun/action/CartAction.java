package com.weikun.action;

import java.util.List;

import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

import com.opensymphony.xwork2.ActionSupport;
import com.weikun.service.CartServiceImpl;
import com.weikun.service.ICartService;
import com.weikun.vo.Cart;
import com.weikun.vo.Orders;
@ParentPackage(value="struts-default")
@Namespace(value="/shop")
@Results({	
	@Result(name="success",location="/shop/addItemToCart.jsp",type="dispatcher"),
	@Result(name="input",location="/shop/addItemToCart.jsp",type="dispatcher")
	
	
})
public class CartAction extends ActionSupport {
	private ICartService service=new CartServiceImpl();
	private String [] lines;
	private String [] orderids;
	private String [] quantitys;
	
	public String[] getOrderids() {
		return orderids;
	}


	public void setOrderids(String[] orderids) {
		this.orderids = orderids;
	}


	public String[] getQuantitys() {
		return quantitys;
	}


	public void setQuantitys(String[] quantitys) {
		this.quantitys = quantitys;
	}


	public String[] getLines() {
		return lines;
	}


	public void setLines(String[] lines) {
		this.lines = lines;
	}

	private Cart cart;
	
	
	public Cart getCart() {
		return cart;
	}


	public void setCart(Cart cart) {
		this.cart = cart;
	}

	private List<Cart> list;
	
	public List<Cart> getList() {
		return list;
	}


	public void setList(List<Cart> list) {
		this.list = list;
	}
	public String update() throws Exception {
		System.out.println(this.lines);
		Cart c=new Cart();
		for(int i=0;i<lines.length;i++){
			
			c.setLinenum(new Integer(lines[i]));
			c.setQuantity(new Integer(quantitys[i]));
			Orders s=new Orders();
			s.setOrderid(new Integer(orderids[i]));
			c.setOrders(s);
			list=service.updateCart(c);
			
		}
		
		return "success";
	}

	public String add() throws Exception {
		// TODO Auto-generated method stub
		list=service.addCart(cart);
		
		
		return "success";
	}
}
