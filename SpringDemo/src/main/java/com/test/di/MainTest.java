package com.test.di;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainTest {

	public static void main(String[] args) {
		AbstractApplicationContext ctx = 
		new GenericXmlApplicationContext("classpath:test.xml");
		
		TestDAO tdao = (TestDAO) ctx.getBean("testDaoImp",TestDAOImp.class);
		tdao.printMsg();
	}

}
