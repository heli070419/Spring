package com.heli.test.resource;

import java.io.IOException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.heli.resource.HeliResource;
import com.heli.test.base.UnitTestBase;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestResource extends UnitTestBase {

	public TestResource(){
		super("classpath:spring-resource.xml");
	}
	
	@Test
	public void testResource(){
		HeliResource heliResource = super.getBean("heliResource");
		try {
			heliResource.resource();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
