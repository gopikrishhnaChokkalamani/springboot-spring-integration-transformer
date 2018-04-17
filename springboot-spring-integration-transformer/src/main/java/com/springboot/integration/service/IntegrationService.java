package com.springboot.integration.service;

import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessagingException;
import org.springframework.stereotype.Component;

@Component
public class IntegrationService {

	@ServiceActivator(inputChannel = "integration.student.objectToJson.channel", outputChannel = "integration.student.jsonToObject.channel")
	public Message<?> recieveMessage(Message<?> message) throws MessagingException {
		System.out.println(message);
		return message;
	}

	@ServiceActivator(inputChannel = "integration.student.jsonToObject.fromTransformer.channel")
	public void processJsonToObject(Message<?> message) throws MessagingException {
		System.out.println(message);
	}
}