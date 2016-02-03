package com.github.yukihane.java;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.net.URLClassLoader;

public class MyPlugin {

	private final Greet greet;

	public MyPlugin() {
		File file = new File("hello-module-module2/target/hello-module-module2-1.0-SNAPSHOT.jar");
		System.out.println(file.exists());
		System.out.println(file.toURI());
		try (URLClassLoader loader = new URLClassLoader(new URL[] { file.toURI().toURL() })) {
			Class<?> c = loader.loadClass("com.github.yukihane.java.GreetImpl");
			greet = (Greet) c.newInstance();
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | IOException e) {
			throw new RuntimeException(e);
		}
	}

	String exec() {
		return greet.greet();
	}
}
