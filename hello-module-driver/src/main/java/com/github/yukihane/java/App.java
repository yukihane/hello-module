package com.github.yukihane.java;

public class App {
	public static void main(String[] args) {
		Greet greet = new GreetImpl();
		System.out.println(greet.greet());
		
		MyPlugin plugin = new MyPlugin();
		System.out.println(plugin.exec());
	}
}
