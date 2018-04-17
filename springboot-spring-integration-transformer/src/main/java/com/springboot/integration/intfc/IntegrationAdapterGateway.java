package com.springboot.integration.intfc;

import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.annotation.MessagingGateway;

import com.springboot.integration.model.Student;

@MessagingGateway
public interface IntegrationAdapterGateway {
	@Gateway(requestChannel = "integration.student.gateway.channel")
	public void sendMessage(Student message);
}
