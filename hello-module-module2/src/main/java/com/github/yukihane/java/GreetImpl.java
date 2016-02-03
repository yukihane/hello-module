package com.github.yukihane.java;

public class GreetImpl implements Greet {

	public GreetImpl() {
		System.out.println("(2)");
	}

	@Override
	public String greet() {
		return "good afternoon(2)";
	}
}
