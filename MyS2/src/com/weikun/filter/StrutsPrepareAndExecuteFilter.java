package com.weikun.filter;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Map;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

import com.weikun.bean.ActionConfig;
import com.weikun.service.ActionHelperService;
@WebFilter(urlPatterns={"/*"})
public class StrutsPrepareAndExecuteFilter implements Filter {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}
	private ActionHelperService service=new ActionHelperService();
	private static final  String FILENAME="struts.xml";
	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1,
			FilterChain arg2) throws IOException, ServletException {
		// TODO Auto-generated method stub

		HttpServletRequest request=(HttpServletRequest)arg0;
		String actionname=request.getServletPath();
		
		Map<String,ActionConfig> amap=service.parseAcion(FILENAME);
		String s=actionname.split("!")[0];//serviceAction
		
		
		ActionConfig ac=amap.get(s.substring(1).trim());//   /index.jsp
		if(ac==null){
			arg2.doFilter(arg0,arg1);

		}else{
			String result="";
			if(actionname.lastIndexOf("!")>0){//找到！，代表特殊方法 serviceAction!go
				result=reflectActionClass(ac.getActionClass(),actionname.split("!")[1]);
			}else{
				result=reflectActionClass(ac.getActionClass(),"execute");
			}
			
			String view=ac.getResult().get(result);

			RequestDispatcher dispatcher=request.getRequestDispatcher(view);


			dispatcher.forward(arg0, arg1);


		}


		//ac.get


		//解析XML
		//



	}
	//反射类，并且执行核心方法
	public String reflectActionClass(String actionClass,String  methodName){//!methodName
		String result="";
		try {

			Class<?> c=Class.forName(actionClass);//com.weikun.action.ServiceAction
			Object o=c.newInstance();
			Method ms[]=c.getMethods();


			for(Method m :ms ){
				System.out.println(m.getName());

				if(m.getName().equals(methodName)){
					result=m.invoke(o).toString();//success
					break;
				}

			}


		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return result;
	}


	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

	}

}
