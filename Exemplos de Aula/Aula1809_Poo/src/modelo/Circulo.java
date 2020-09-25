package modelo;

public class Circulo {
	
	//Atributos - raio
	private float raio;
	
	//Construtor - unico metodo q n precisa de retorno
	public Circulo(float r) {
		this.raio = r;
	}

	public Circulo() {}
	
	//Acessadores e Modificadores de Atributos
	//GET 
	public float getRaio() {
		
		return this.raio;
	}
	
	//SET
	public void setRaio(float novoRaio) {
		this.raio = novoRaio;
	}
	
	
	//métodos
	// - Area = pi*r*r
	public float calcularArea() {
		return (3.14f * this.raio * this.raio);
	}
	
	
	

}
