package com.weikun.action;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.weikun.service.CartServiceImpl;
import com.weikun.service.ICartService;
import com.weikun.po.Account;
import com.weikun.po.Cart;
import com.weikun.po.CartId;
import com.weikun.po.Orders;
@ParentPackage(value="struts-default")
@Namespace(value="/shop")
@Results({	
	@Result(name="success",location="/shop/addItemToCart.jsp",type="dispatcher"),
	@Result(name="input",location="/shop/addItemToCart.jsp",type="dispatcher")
	
	
})
public class CartAction extends ActionSupport  implements SessionAware{
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
			CartId id=new CartId();
			id.setLinenum(new BigDecimal(new Integer(lines[i])));
			
			
			c.setId(id);
			c.setQuantity(new BigDecimal(new Integer(quantitys[i])));
			Orders s=new Orders();
			s.setOrderid(new BigDecimal(new Integer(orderids[i])));
			c.getId().setOrders(s);
			list=service.updateCart(c);
			
		}
		
		return "success";
	}

	public String add() throws Exception {
		// TODO Auto-generated method stub
		String username=((Account)map.get("account")).getUsername();
		list=service.addCart(cart,username);
		
		
		
		return "success";
	}

	private Map<String,Object> map;
	@Override
	public void setSession(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		map=arg0;
	}
}
