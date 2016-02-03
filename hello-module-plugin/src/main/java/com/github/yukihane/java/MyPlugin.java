package com.github.yukihane.java;

public class MyPlugin {

	private final Greet greet = new GreetImpl();

	String exec() {
		return greet.greet();
	}
}
