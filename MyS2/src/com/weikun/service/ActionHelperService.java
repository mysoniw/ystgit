package com.weikun.service;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.imageio.stream.FileImageInputStream;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import com.weikun.bean.ActionConfig;

public class ActionHelperService {
	public static void main(String[] args) {
		ActionConfig ac=new ActionHelperService().parseAcion("struts.xml");
		System.out.println(ac.getActionName());
		System.out.println(ac.getActionClass());
		System.out.println(ac.getResult().get("success"));
	}
	public ActionConfig parseAcion(String filename){
		
		InputStream is=ActionHelperService.class.getClassLoader().getResourceAsStream(filename);
		
		ActionConfig ac=new ActionConfig();
		try {
			SAXReader sr=new SAXReader();
			Document doc=sr.read(is);
			Element root=doc.getRootElement();
			
			
			Element pac=root.element("package");
			//System.out.println(pac.attributeValue("name"));
			List<Element> actions=pac.elements("action");
			Iterator<Element> ita=actions.iterator();
			
			while(ita.hasNext()){
				
				Element action=ita.next();
				
				ac.setActionName(action.attributeValue("name"));
				ac.setActionClass(action.attributeValue("class"));
				
				List<Element> results=action.elements("result");
				
				Iterator<Element> itr=results.iterator();
				Map<String,String> map=new HashMap<String,String>();
				while(itr.hasNext()){
					Element result=itr.next();
					
					map.put(result.attributeValue("name"),result.getTextTrim());
					
				}
				
				ac.setResult(map);
			}
			
			
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return ac;
		
	}
}
