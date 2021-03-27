package model;

public class Retangulo { 
	
	//atributos
	private float base; //public, protected ou private - encapsulamento (visibilidade)
	private float altura;
	
	//construtor
	public Retangulo(float b, float h) {
		this.altura = h;
		this.base = b;
	}
	
	//metodos
	public float calcularArea() {
		return this.altura * this.base;
	}
	
	public float calcularPerimetro() {
		return 2*(this.base+this.altura);
		
	}

}
