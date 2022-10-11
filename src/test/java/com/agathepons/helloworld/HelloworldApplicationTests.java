package com.agathepons.helloworld;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.agathepons.helloworld.service.BusinessService;

@SpringBootTest
class HelloworldApplicationTests {
	
	@Autowired
	private BusinessService bs;

	@Test
	void contextLoads() {
	}
	
	@Test
	public void testGetHelloWorld() {
		String expected = "Hello World! How are you?";
		String result = bs.getHelloWorld().getGreetings();
		
		assertEquals(expected, result);
	}

}
