package com.test.diEX1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		MyGetsum mgs1=new MyGetsum();
		mgs1.setGetsum(new Getsum());
		mgs1.setA(33);
		mgs1.setB(55);
		mgs1.sum();
		
		System.out.println("------------------");
		AbstractApplicationContext ctx
		=new GenericXmlApplicationContext("classpath:getsum.xml");
		
		MyGetsum mygetsum=ctx.getBean("mygetsum",MyGetsum.class);
	}

}
