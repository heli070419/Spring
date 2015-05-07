package com.heli.lifecycle;


public class BeanLifeCycle{ //implements InitializingBean,DisposableBean {

	public void defaultInit(){
		System.out.println("default init...");
	}
	
	public void defaultDestroy(){
		System.out.println("default destroy...");
	}
//	@Override
//	public void destroy() throws Exception {
//		System.out.println("start destroy...");
//	}
//
//	@Override
//	public void afterPropertiesSet() throws Exception {
//		System.out.println("start afterPropertiesSet...");
//		
//	}

//	public void start(){
//		System.out.println("start bean...");
//	}
//	
//	public void stop(){
//		System.out.println("stop bean...");
//	}
}
