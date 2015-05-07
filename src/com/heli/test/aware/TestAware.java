package com.heli.test.aware;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.heli.test.base.UnitTestBase;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestAware extends UnitTestBase {

	public TestAware(){
		super("classpath:spring-aware.xml");
	}
	
//	@Test
//	public void TestHeliApplicationContext(){
//		
//	}
	@Test
	public void TestHeliBeanName(){
		System.out.println("TestHeliBeanName:"+ super.getBean("heliBeanName"));
	}
}
