package com.github.yukihane.java;

public class GreetImpl implements Greet {

	public GreetImpl() {
		System.out.println("(1)");
	}

	@Override
	public String greet() {
		return "good morning(1)";
	}
}
