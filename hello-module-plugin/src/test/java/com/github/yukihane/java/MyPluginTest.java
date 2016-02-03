package com.github.yukihane.java;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyPluginTest {

	@Test
	public void test() {
		MyPlugin plugin = new MyPlugin();
		assertEquals("good afternoon(2)", plugin.exec());
	}

}
