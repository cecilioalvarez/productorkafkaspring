package es.curso.producto1.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import es.curso.cola.Examen;

@RestController
public class HolaController {


	@Autowired
	private KafkaTemplate<String,Examen> kafkaTemplate;
	
	
	@RequestMapping("/enviar")
	public String enviar(@RequestParam String mensaje) {
		String topic= "examen-events";
		Examen e= new Examen();
		e.setNota(2);
		e.setTexto("blabla");
		kafkaTemplate.send(topic,e);
		return "mensaje enviado";
	}
}
