package com.springcoreApp;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class EmpApplication {

	public static void main(String[] args) {
	
		Resource r=new ClassPathResource("test.xml");
		BeanFactory bf=new XmlBeanFactory(r);
		Test t1=(Test)bf.getBean("t1");
	}

}
