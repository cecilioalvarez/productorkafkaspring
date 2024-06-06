package es.curso.producto1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class Producto1Application implements CommandLineRunner{

	@Autowired
	private KafkaTemplate<String,String> kafkaTemplate;
	
	
	public static void main(String[] args) {
		SpringApplication.run(Producto1Application.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		System.out.println("hola se ejecuta");
		String topic= "examen-events";
		kafkaTemplate.send(topic,"hola desde spring");
		
	}

}
