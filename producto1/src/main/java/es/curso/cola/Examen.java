package es.curso.cola;

public class Examen {

	private String texto;
	private double nota;
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}
	public Examen(String texto, double nota) {
		super();
		this.texto = texto;
		this.nota = nota;
	}
	public Examen() {
		super();
	}
	
	
}
