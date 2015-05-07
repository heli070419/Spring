package com.heli.test.ioc.interfaces;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.heli.ioc.injection.service.InjectionService;
import com.heli.test.base.UnitTestBase;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestInjection extends UnitTestBase {

	public TestInjection(){
		super("classpath:spring-injection.xml");
	}
	
	@Test
	public void testSetter(){
		InjectionService service = super.getBean("injectionService");
		service.save("this is saving data");
	}
	
	@Test
	public void testConstructor(){
		InjectionService service = super.getBean("injectionService");
		service.save("this is saving data");
	}
	
}
