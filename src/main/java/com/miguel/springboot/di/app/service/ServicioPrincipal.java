package com.miguel.springboot.di.app.service;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
//@Primary
//@Service("miServicioSimple")
public class ServicioPrincipal implements IServicioPrincipal {
	
	@Override
	public String operacion() {
		
		return "probando el servicio simple";
	}
}
