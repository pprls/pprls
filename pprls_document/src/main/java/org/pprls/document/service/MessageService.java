package org.pprls.document.service;

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
	@Autowired
	public MessageService() {
	}

	public void send(Message message) {
		throw new UnsupportedOperationException();
	}
	
	
	
}
