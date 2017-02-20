package com.example.receiver;

import org.springframework.context.support.GenericXmlApplicationContext;

public class TestListener {
	public static void main(String[] args) {
		GenericXmlApplicationContext context= new GenericXmlApplicationContext();
		context.load("classpath:com/example/receiver/application-context.xml");
		context.refresh();
		
		while(true){}
	}

}
