package com.heli.test.autowiring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.heli.autowiring.AutoWiringService;
import com.heli.test.base.UnitTestBase;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestAutoWiring extends UnitTestBase {

	public TestAutoWiring(){
		super("classpath:spring-autowiring.xml");
	}
	
	@Test
	public void TestSay(){
		AutoWiringService service = super.getBean("autoWiringService");
		service.say("Hello World");
	}
}
