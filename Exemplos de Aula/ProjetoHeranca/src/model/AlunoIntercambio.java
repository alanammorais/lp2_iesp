package model;

public class AlunoIntercambio extends Aluno { // extends para classe pai
	
	private String passaporte;
	private String faculdadeOrigem;
	
	public AlunoIntercambio(String nome, Turma turma, char sexo, String passaporte, String faculdadeOrigem) {
		super(nome, turma, sexo);
		this.passaporte = passaporte;
		this.faculdadeOrigem = faculdadeOrigem;
	}
	
	public AlunoIntercambio(String nome, char sexo, String passaporte, String faculdadeOrigem) {
		super(nome, null, sexo);
		this.passaporte = passaporte;
		this.faculdadeOrigem = faculdadeOrigem;
	}
	
	public AlunoIntercambio() {}

	public String getPassaporte() {
		return passaporte;
	}

	public void setPassaporte(String passaporte) {
		this.passaporte = passaporte;
	}

	public String getFaculdadeOrigem() {
		return faculdadeOrigem;
	}

	public void setFaculdadeOrigem(String faculdadeOrigem) {
		this.faculdadeOrigem = faculdadeOrigem;
	}

	public String toString() {
		return "AlunoIntercambio [passaporte=" + passaporte + ", faculdadeOrigem=" 
				+ faculdadeOrigem + ", Nome="+ getNome() + ", Turma=" + getTurma() 
				+ ", Sexo=" + getSexo() + "]";
	}
	
	

}
