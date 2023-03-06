package com.miguel.springboot.di.app.service;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("miServicioComplejo")
// con esta anotacion permite seleccionar el candidato por defecto

public class ServicioComplejo implements IServicioPrincipal {
	
	@Override
	public String operacion() {
		
		return "probando el servicio complejo";
	}
}
