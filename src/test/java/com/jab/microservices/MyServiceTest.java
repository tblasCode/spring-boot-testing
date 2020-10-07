package com.jab.microservices;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MyServiceTest {
	
	@Autowired
	private MyService service;

	@Test
	public void service_return_text_when_ok() {
		assertEquals("Hello, World", service.greet());
	}
}
