/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import modelo.Aluno;
import modelo.AlunoIntercambio;
import modelo.AlunoUniesp;

/**
 *
 * @author alanamorais
 */
public class Teste {
    
    public static void main(String[] args){
        
        
        Aluno ana = new AlunoUniesp(
                "1231234alu", "Rua teste", "Ana Beatriz", 'f');
        Aluno john = new AlunoIntercambio(
                "GFY354652", "Australia", "John Smith", 'm');
        
        System.out.println();
        System.out.println(ana);
        System.out.println(john);
    
        ana.matricularAlunoTurma("POO");
        john.matricularAlunoTurma("POO");
    
        System.out.println();
        System.out.println(ana);
        System.out.println(john);
    
    }
}
