package org.pprls.registry.service;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageService {
	
	@Autowired
	RabbitTemplate rabbitTemplate;
	
	/**
	 * The constructor
	 */
	public MessageService() {
	}

	public void send(Message message) {
		rabbitTemplate.convertAndSend("registry.queue", message);
	}
	
	
	
}
