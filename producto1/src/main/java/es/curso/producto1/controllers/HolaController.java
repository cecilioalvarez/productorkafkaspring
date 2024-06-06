package es.curso.producto1.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaController {

	@RequestMapping("/hola")
	public String hola() {
		
		return "hola";
	}
}
