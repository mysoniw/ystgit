package com.weikun.action;

import java.util.Locale;
import java.util.Map;

import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
@ParentPackage(value="struts-default")
@Results({
	@Result(name="index",location="/index.jsp",type="dispatcher")
	
	
})
public class I18nAction extends ActionSupport implements SessionAware {
	private String key;
	
	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		Locale l=null;
		if(key.equals("1")){//ÖÐÎÄ
			l=Locale.CHINA;
			
		}else if(key.equals("2")) {//Ó¢ÎÄ
			l = Locale.US;
		}
		
		ActionContext.getContext().setLocale(l);
		session.put("WW_TRANS_I18N_LOCALE", l);
		
		return "index";
	}
	private Map<String, Object> session;
	@Override
	public void setSession(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		session=arg0;
	}
	
}
