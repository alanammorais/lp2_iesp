package model;

public class MolduraRetangular {
	
	//atributos
	//Composição
	private Retangulo retanguloMaior;
	private Retangulo retanguloMenor;
	
	//construtor - nao retorno
	public MolduraRetangular(Retangulo rMaior, Retangulo rMenor) {
		this.retanguloMaior = rMaior;
		this.retanguloMenor = rMenor;	
	}
	
	//metodos
	public float area() {
	  return this.retanguloMaior.calcularArea() - this.retanguloMenor.calcularArea();
	}
	

}
