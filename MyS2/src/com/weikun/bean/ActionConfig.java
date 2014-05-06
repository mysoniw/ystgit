package com.weikun.bean;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class ActionConfig implements Serializable {
	private String actionName;
	private String actionClass;
	private Map<String,String> result=new HashMap<String,String>();
	public String getActionName() {
		return actionName;
	}
	public void setActionName(String actionName) {
		this.actionName = actionName;
	}
	public String getActionClass() {
		return actionClass;
	}
	public void setActionClass(String actionClass) {
		this.actionClass = actionClass;
	}
	public Map<String, String> getResult() {
		return result;
	}
	public void setResult(Map<String, String> result) {
		this.result = result;
	}
	
}
