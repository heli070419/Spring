package com.heli.beanannotation;

import org.springframework.stereotype.Component;

@Component
public class BeanAnnotation {

	public void say(String arg){
		System.out.println("BeanAnnotation: " + arg);
	}
}
