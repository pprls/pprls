package org.pprls.document.service;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

@Service
public class MessageService {
	
	private String user;

	/**
	 * The constructor
	 */
	@Autowired
	public MessageService() {
	}

	@RabbitListener(queues = "registry.queue")
	public void receive(String data) {	
		System.out.println(data);
		
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}
}
