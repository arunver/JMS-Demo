package com.example.receiver;

import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

public class MyMessageListener implements MessageListener{

	@Override
	public void onMessage(Message m) {
		TextMessage msg=(TextMessage)m;
		
		try{
			System.out.println(msg.getText());
		}
		catch(Exception e)
		{
			System.out.println(e.getStackTrace());
		}
		
	}

}
