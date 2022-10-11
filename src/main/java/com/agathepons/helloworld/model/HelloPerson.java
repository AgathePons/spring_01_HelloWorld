package com.agathepons.helloworld.model;

public class HelloPerson {
private String hello = "Hello ";
private String name;
	
	public HelloPerson(String name) {
		System.out.println("HelloPerson>constructor: this.name = " + name);
		this.name = name;
	}
	
	public String helloPersonText = hello + name;

	public String getHelloPersonText() {
		System.out.println("HelloPerson>getHelloPersonText");
		return helloPersonText;
	}
	
	public void setHelloPersonTexts(String greetings) {
		System.out.println("HelloPerson>setHelloPersonTexts");
		this.helloPersonText = greetings;
	}
	
	@Override
	public String toString() {
		System.out.println("HelloPerson>toString:");
		return helloPersonText;
	}
}
