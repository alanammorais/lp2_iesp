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
public class Aluno{
    
    private String nome;
    private char sexo;
    private String turma;

    //polimorfismo
    public Aluno(String nome, char sexo, String turma) {
        this.nome = nome;
        this.sexo = sexo;
        this.turma = turma;
    }
    
    public Aluno(String nome, char sexo) {
        this.nome = nome;
        this.sexo = sexo;
    }
    
    public void matricularAlunoTurma(String t){
        this.turma = t;
    }

    public String toString() {
        return "Aluno{" + "nome=" + nome + ", sexo=" + sexo + ", turma=" + turma + '}';
    }

    public Aluno() {
    }

    public String getNome() {
        return nome;
    }

    public char getSexo() {
        return sexo;
    }

    public String getTurma() {
        return turma;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }
    
    
    
    
}
