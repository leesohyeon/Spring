package com.test.sport;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainSport {

	public static void main(String[] args) {
		AbstractApplicationContext ctx=new GenericXmlApplicationContext("classpath:playinfo.xml");
				
				PlayerInfo ppp=ctx.getBean("playerinfo",PlayerInfo.class);
				System.out.println(ppp.getPlayer().getName());
	}

}
