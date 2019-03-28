package com.test.diEX2;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.test.diEX1.MyGetsum;

public class Main {

	public static void main(String[] args) {
		AbstractApplicationContext ctx
		=new GenericXmlApplicationContext("classpath:exdao.xml");
		
		ExDAO ex=ctx.getBean("exdao",ExDAO.class);
		ex.output();
	}

}
