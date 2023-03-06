package com.miguel.springboot.di.app.service;


import org.springframework.stereotype.Service;

@Service("miServicioSimple")
public class ServicioPrincipal implements IServicioPrincipal {
	
	@Override
	public String operacion() {
		
		return "probando el servicio";
	}
}
