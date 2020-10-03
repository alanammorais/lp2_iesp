package modelo;

import visao.Retangulo;

public class Moldura {

	//atributos
	private Retangulo retInterno;
	private Retangulo retExterno;
	
	//construtor
	public Moldura(Retangulo retanguloInterno, Retangulo retanguloExterno) {
		this.retInterno = retanguloInterno;
		this.retExterno = retanguloExterno;
	}

	public Moldura() {}
	
	//metodos
	public float areaMoldura() {
		return this.retExterno.area() - this.retInterno.area();
	}
	
	public float valorMoldura(float precoM2) {
		return precoM2 * areaMoldura();
	}
	
	//gets e sets
	public Retangulo getRetInterno() {
		return retInterno;
	}

	public void setRetInterno(Retangulo retInterno) {
		this.retInterno = retInterno;
	}

	public Retangulo getRetExterno() {
		return retExterno;
	}

	public void setRetExterno(Retangulo retExterno) {
		this.retExterno = retExterno;
	}

	//toString
	public String toString() {
		return "Moldura - retInterno=" + this.retInterno + ", retExterno=" + this.retExterno;
	}
	
	
	
	
	
	
}
