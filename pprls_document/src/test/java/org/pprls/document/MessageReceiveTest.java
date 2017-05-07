package org.pprls.document;

import static org.junit.Assert.fail;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.pprls.document.service.MessageService;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@EntityScan("org.pprls.registry.domain")
@EnableRabbit
public class MessageReceiveTest {
	@Autowired
	MessageService messageService;
	
	@Test
	public void testMessage() {
		//assert 
	}

}
