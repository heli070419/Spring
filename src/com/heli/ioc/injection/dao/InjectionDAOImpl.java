package com.heli.ioc.injection.dao;

public class InjectionDAOImpl implements InjectionDAO {

	@Override
	public void save(String arg) {
		System.out.println("saving data:"+ arg);
	}
	
}
