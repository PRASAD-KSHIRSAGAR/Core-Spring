package com.Springcoreproject2;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TeamApplications {

	public static void main(String[] args) {
		
		Resource r=new ClassPathResource("Team.xml");
		BeanFactory bf=new XmlBeanFactory(r);
		Team t=(Team)bf.getBean("team");
		t.show();

	}

}
