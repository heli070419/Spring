package com.heli.test.lifecycle;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.heli.lifecycle.BeanLifeCycle;
import com.heli.test.base.UnitTestBase;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestBeanLifecycle extends UnitTestBase {

	public TestBeanLifecycle(){
		super("classpath:spring-lifecycle.xml");
	}
	
	@Test
	public void test1(){
		BeanLifeCycle bean = super.getBean("beanLifeCycle");
	}
}
