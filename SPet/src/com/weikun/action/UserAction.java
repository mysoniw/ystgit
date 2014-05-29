package com.weikun.action;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Actions;
import org.apache.struts2.convention.annotation.InterceptorRef;

import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;


import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;
import com.weikun.service.CategoryServieImpl;
import com.weikun.service.ICategoryService;
import com.weikun.service.IUserService;
import com.weikun.service.UserServiceImpl;

import com.weikun.vo.Category;


@ParentPackage(value="struts-default")
@Namespace(value="/shop")



@Actions({
	@Action(value="/user",
			results={
				@Result(name="loginmain",location="/shop/loginMain.jsp",type="dispatcher"),
				@Result(name="success",location="/shop/main.jsp",type="dispatcher"),
				@Result(name="main",location="/shop/main.jsp"),
				@Result(name="invalid.token",location="/shop/loginMain.jsp")
			},interceptorRefs={
			@InterceptorRef(value="defaultStack"),
			@InterceptorRef(value="token",params={"includeMethods","login"})
		
			}),
	
	@Action(value="/register",
			results={				
				@Result(name="regmain",location="/shop/registerUser.jsp",type="dispatcher"),
				@Result(name="input",location="/shop/registerUser.jsp",type="dispatcher"),
				@Result(name="invalid.token",location="/shop/registerUser.jsp"),
				@Result(name="loginmain",location="/shop/loginMain.jsp",type="dispatcher"),
			},
			interceptorRefs={
					@InterceptorRef(value="defaultStack"),					
					@InterceptorRef(value="token",params={"includeMethods","register"})
				
			})
})


public class UserAction extends ActionSupport implements Preparable {
	private IUserService service =new UserServiceImpl();
	private ICategoryService cservice=new CategoryServieImpl();
	private com.weikun.po.Account account;
	private List<com.weikun.po.Category> list;

	public List<com.weikun.po.Category> getList() {
		return list;
	}



	public void setList(List<com.weikun.po.Category> list) {
		this.list = list;
	}



	public com.weikun.po.Account getAccount() {
		return account;
	}

	public void setAccount(com.weikun.po.Account account) {
		this.account = account;
	}
	public String loginmain() throws Exception {

		return "loginmain";
	}
	public String register() throws Exception {
		if(this.hasErrors()){
			return "input";
		}else{
			if(service.addA(account)){

				return "loginmain";
			}else{
				return "regmain";
			}
		}
	
		

	}

	public void validateRegister() {
		// TODO Auto-generated method stub
//		if(!account.getPassword().equals(account.getRepassword())){
//			this.addFieldError("account.password", this.getText("register.error.repeat"));
//
//		}
//		if(!account.getEmail().matches("^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$")){
//			this.addFieldError("account.email", this.getText("register.error.email"));
//
//		}



	}
	
	public String main() throws Exception {
		
		return "main";
		
	}
	public String regmain() throws Exception {
		
			
			return "regmain";
			
		
		

	}
	public String login() throws Exception {
		// TODO Auto-generated method stub
		if(service.login(account)){
			HttpSession session=ServletActionContext.getRequest().getSession();
			
			session.setAttribute("account", account);

			
			
			return "success";
		}
		return "success";



	}



	@Override
	public void prepare() throws Exception {
		// TODO Auto-generated method stub
		list=cservice.queryC();
	}
}
