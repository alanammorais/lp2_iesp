package model;

public class Moldura {
	
	//atributos
	//protected float altura;
	private float altura;
	private float base;
	private float espessura;
	
	//construtor
	public Moldura(float h, float l, float e) {
		this.altura = h;
		this.base = l;
		this.espessura = e;
	}
	
	//métodos
	//area
	public float area() {
		return (this.base * this.altura)-(
				(this.base-2*this.espessura)*(this.altura- 2*espessura));
	}
	

}






