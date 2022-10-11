package com.agathepons.helloworld.service;

import org.springframework.stereotype.Component;

import com.agathepons.helloworld.model.HelloPerson;
import com.agathepons.helloworld.model.HelloWorld;

@Component
public class BusinessService {

	public HelloWorld getHelloWorld() {
		System.out.println("bs: before new instance of HelloWorld()");
		HelloWorld helloWorld = new HelloWorld();
		System.out.println("bs: after new instance of HelloWorld()");
		return helloWorld;
	}
	
	public HelloPerson getHelloPerson() {
		System.out.println("bs: called");
		HelloPerson helloPerson = new HelloPerson("Kevin");
		System.out.println("bs: new instance of HelloPerson(\"Kevin\")");
		return helloPerson;
	}
}

