package com.heli.ioc.injection.service;

import com.heli.ioc.injection.dao.InjectionDAO;

public class InjectionServiceImpl implements InjectionService {

	private InjectionDAO injectionDAO;
	
	//constructor injection
	public InjectionServiceImpl(InjectionDAO injectionDAO){
		this.injectionDAO = injectionDAO;
	}
	//setter injection
	public void setInjectionDAO(InjectionDAO injectionDAO) {
		this.injectionDAO = injectionDAO;
	}

	@Override
	public void save(String arg) {
		
		System.out.println("Service reiceving args :"+arg);
		arg = arg+ ":" + this.hashCode();
		injectionDAO.save(arg);
		
	}

}
