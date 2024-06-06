package es.curso.producto1.listeners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import es.curso.cola.Examen;
import es.curso.producto1.eventos.InsertarExamenEvent;
@Component
public class InsertarEventoListener implements ApplicationListener<InsertarExamenEvent> {

	@Autowired
	private KafkaTemplate<String,Examen> kafkaTemplate;
	
	@Override
	public void onApplicationEvent(InsertarExamenEvent event) {
	
		System.out.println("listener de examen");
		String topic= "examen-events";
		
		kafkaTemplate.send(topic,(Examen)event.getSource());
		
		
	}

}
