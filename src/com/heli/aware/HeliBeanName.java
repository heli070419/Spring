package com.heli.aware;

import org.springframework.beans.factory.BeanNameAware;

public class HeliBeanName implements BeanNameAware {

	@Override
	public void setBeanName(String name) {
		System.out.println("HeliBeanName :"+ name);
		
	}

}
