/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author alanamorais
 */
public class AlunoIntercambio extends Aluno{
    
    private String passaporte;
    private String universidadeOrigem;

    public AlunoIntercambio(String passaporte, String universidadeOrigem, String nome, char sexo, String turma) {
        super(nome, sexo, turma);
        this.passaporte = passaporte;
        this.universidadeOrigem = universidadeOrigem;
    }

    public AlunoIntercambio(String passaporte, String universidadeOrigem, String nome, char sexo) {
        super(nome, sexo);
        this.passaporte = passaporte;
        this.universidadeOrigem = universidadeOrigem;
    }

    public AlunoIntercambio() {
        super();
    }

    //Sobrescrita - Override
    public void matricularAlunoTurma(String t){
        String novo = t+"-English";
        setTurma(novo);
    }
    
    public String getPassaporte() {
        return passaporte;
    }

    public void setPassaporte(String passaporte) {
        this.passaporte = passaporte;
    }

    public String getUniversidadeOrigem() {
        return universidadeOrigem;
    }

    public void setUniversidadeOrigem(String universidadeOrigem) {
        this.universidadeOrigem = universidadeOrigem;
    }

    public String toString() {
        return "AlunoIntercambio{" + 
                "Nome= "+ getNome()+
                ", Sexo= "+ getSexo()+ 
                ", Turma= "+ getTurma()+
                ", passaporte= " + passaporte + 
                ", universidadeOrigem= " + universidadeOrigem + '}';
    }
        
}
