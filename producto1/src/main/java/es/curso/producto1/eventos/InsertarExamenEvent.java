package es.curso.producto1.eventos;

import org.springframework.context.ApplicationEvent;

import es.curso.cola.Examen;

public class InsertarExamenEvent extends ApplicationEvent {

	
	public InsertarExamenEvent(Examen examen) {
		super(examen);
		
		// TODO Auto-generated constructor stub
	}

}
