package es.curso.producto1.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import es.curso.cola.Examen;
import es.curso.producto1.services.ExamenService;

@RestController
public class HolaController {

	@Autowired
	private ExamenService examenService;
	
	
	@RequestMapping("/enviar")
	public String enviar(@RequestParam String  texto, @RequestParam int nota) {
		
		Examen e= new Examen(texto,nota);
		examenService.insertarExamen(e);
		return "mensaje enviado";
	}
}
