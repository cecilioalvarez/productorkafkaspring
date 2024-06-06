package es.curso.producto1.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import es.curso.cola.Examen;
import es.curso.producto1.eventos.InsertarExamenEvent;

@Service
public class ExamenService {

	@Autowired 
	private ApplicationEventPublisher publicador;
	
	
	
	
	public void insertarExamen(Examen e) {
		
		InsertarExamenEvent evento= new InsertarExamenEvent(e);
		
		System.out.println("inserto examen");
		publicador.publishEvent(evento);
		
	
		
		
	
	}
}
