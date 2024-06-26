package es.curso.producto1.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaController {


	@Autowired
	private KafkaTemplate<String,String> kafkaTemplate;
	
	
	@RequestMapping("/enviar")
	public String enviar(@RequestParam String mensaje) {
		String topic= "examen-events";
		kafkaTemplate.send(topic,mensaje);
		return "mensaje enviado";
	}
}
