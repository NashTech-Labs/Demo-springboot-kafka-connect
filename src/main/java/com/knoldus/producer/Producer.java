package com.knoldus.producer;

import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;
import com.knoldus.message.Message;

@Component
public class Producer {
	@Autowired
	private KafkaTemplate<String, Message> kafkaTemplate;
	@Value("${spring.kafka.topics.topic-test}")
	private String topic;
	public void sendMessage(Message message) {
		final String key = UUID.randomUUID().toString();
		kafkaTemplate.send(topic, key, message);
	}

}
