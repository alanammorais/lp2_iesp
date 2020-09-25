package modelo;

public class Endereco {

	private String rua;
	private int numero;
	private String bairro;
	
	
	public Endereco(String rua, int numero, String bairro) {
		this.rua = rua;
		this.numero = numero;
		this.bairro = bairro;
	}
	
	public Endereco() {}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	
	
}
