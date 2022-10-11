package com.agathepons.helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.agathepons.helloworld.model.HelloPerson;
import com.agathepons.helloworld.model.HelloWorld;
import com.agathepons.helloworld.service.BusinessService;

@SpringBootApplication
public class HelloworldApplication implements CommandLineRunner {
	
	@Autowired
	private BusinessService bs;

	public static void main(String[] args) {
		SpringApplication.run(HelloworldApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		HelloWorld helloWorld = bs.getHelloWorld();
		System.out.println(helloWorld);
		System.out.println("--------------------------------");
		HelloPerson helloPerson = bs.getHelloPerson();
		System.out.println(helloPerson);
	}

}
