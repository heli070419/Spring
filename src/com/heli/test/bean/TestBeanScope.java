package com.heli.test.bean;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.heli.bean.BeanScope;
import com.heli.test.base.UnitTestBase;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestBeanScope extends UnitTestBase {

	public TestBeanScope(){
		super("classpath*:spring-beanscope.xml");
	}
	
	@Test
	public void testSay(){
		BeanScope beanScope = super.getBean("beanScope");
		beanScope.say();
		
		BeanScope beanScope2 = super.getBean("beanScope");
		beanScope2.say();
	}
	
	
}
