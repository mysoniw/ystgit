package com.weikun.action;

import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

import com.opensymphony.xwork2.ActionSupport;
@ParentPackage(value="struts-default")
@Results({
	@Result(name="main",location="",type="dispatcher")
	
	
})
public class UserAction extends ActionSupport {
	
	public String login() throws Exception {
		// TODO Auto-generated method stub
		
		
		
		return "";
	}
}
