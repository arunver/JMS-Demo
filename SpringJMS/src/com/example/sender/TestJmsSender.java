package com.example.sender;

import org.springframework.context.support.GenericXmlApplicationContext;

public class TestJmsSender {

	public static void main(String[] args) {
		
		GenericXmlApplicationContext context= new GenericXmlApplicationContext();
		context.load("classpath*:com/example/sender/application.xml");
		
		context.refresh();
		
		MyMessageSender sender= context.getBean("messageSender",MyMessageSender.class);
		sender.sendMessage("Hello JMS");
	}
}
