package com.heli.test.beanannotation;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.heli.beanannotation.BeanAnnotation;
import com.heli.test.base.UnitTestBase;


@RunWith(BlockJUnit4ClassRunner.class)
public class TestBeanAnnotation extends UnitTestBase {

	public TestBeanAnnotation(){
		super("classpath*:spring-beanannotation.xml");
	}
	
	@Test
	public void testSay(){
		BeanAnnotation beans = super.getBean("injectionService");
	}
}
