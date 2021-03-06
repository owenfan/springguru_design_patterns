package guru.springframework.bridge.abstraction;

import guru.springframework.bridge.implementation.MessageSender;

public abstract class Message {

	MessageSender messageSender; 
	
	public Message(MessageSender messageSender) {
		this.messageSender = messageSender; 
	}
	
	abstract public void send() ; 
}
