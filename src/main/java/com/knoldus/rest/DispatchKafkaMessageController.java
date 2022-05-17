package com.knoldus.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import com.knoldus.builder.MessageBuilder;
import com.knoldus.message.Message;
import com.knoldus.producer.Producer;

@RestController
public class DispatchKafkaMessageController {
	@Autowired
	private Producer producer;

	@PostMapping(path = "/dispatch-topic-message")
	public void dispatchMessage() {
		Message message = MessageBuilder.build();
		producer.sendMessage(message);
	}

}
