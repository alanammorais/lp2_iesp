package modelo;

public class Retangulo {
	
	//Atributos
	private float base;
	private float altura;
	
	//Construtor
	public Retangulo(float b, float a) {
		this.base = b;
		this.altura = a;
	}
	
	public Retangulo() {}
	
	//metodos
	public float area() {
		return this.base*this.altura;
	}

	public float perimentro() {
		return 2*(this.altura+this.base);
	}

	//gets e sets
	public float getBase() {
		return base;
	}

	public void setBase(float base) {
		this.base = base;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	//toString
	public String toString() {
		return "Retangulo - base=" + this.base + ", altura=" + this.altura;
	}

	
	

}
