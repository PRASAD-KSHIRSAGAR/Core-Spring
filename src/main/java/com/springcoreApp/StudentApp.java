package com.springcoreApp;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class StudentApp {

	public static void main(String[] args) {
		
		Resource r=new ClassPathResource("test.xml");
		BeanFactory bf=new XmlBeanFactory(r);
		//Object o=bf.getBean("ei");
		/*if(o!=null)
		{
		/	Employee e=(Employee)o;
			System.out.println(e);
		}*/
		//Employee e=new Employee();
		//String s=e.toString();
		
		Test t1=(Test)bf.getBean("ei");

	}

}



