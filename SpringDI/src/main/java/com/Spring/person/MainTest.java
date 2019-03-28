package com.Spring.person;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainTest {

	public static void main(String[] args) {
		AbstractApplicationContext ctx= new GenericXmlApplicationContext("classpath:person.xml");
		
		PersonInfo personinfo1=ctx.getBean("personinfo",PersonInfo.class);
		personinfo1.printAll();
		
//		Person person1=new Person("채수연","22","여성","010328-4046123");
//		PersonInfo pi1= new PersonInfo(person1);
//		pi1.printAll();
		
			
	}

}
