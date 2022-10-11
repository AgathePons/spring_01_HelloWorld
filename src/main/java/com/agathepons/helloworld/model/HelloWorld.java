package com.agathepons.helloworld.model;

public class HelloWorld {
	private String value = "Hello World!";
	
	private String greetings = value + " How are you?";
	
	public HelloWorld() {
		System.out.println("constructor:");
	}

	public String getGreetings() {
		System.out.println("getGreetings:");
		return greetings;
	}
	
	public void setGreetings(String greetings) {
		System.out.println("setGreetings:");
		this.greetings = greetings;
	}
	
	@Override
	public String toString() {
		System.out.println("toString:");
		return greetings;
	}
	
}
