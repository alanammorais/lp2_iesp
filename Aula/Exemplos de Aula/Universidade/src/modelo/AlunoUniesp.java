package modelo;

/**
 *
 * @author alanamorais
 */
                         //extends para o pai
public class AlunoUniesp extends Aluno{

    //Atributos
    private String matricula;
    private String endereco;
    
    //construtor
    public AlunoUniesp(String matricula, String endereco, String nome, 
            char sexo, String turma) {
        
        super(nome, sexo, turma); //construtor da classe pai
        this.matricula = matricula;
        this.endereco = endereco;
    }

    public AlunoUniesp(String matricula, String endereco, String nome, char sexo) {
        super(nome, sexo);
        this.matricula = matricula;
        this.endereco = endereco;
    }
   
    
    public AlunoUniesp(){
        super();
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String toString() {
        return "AlunoUniesp{" +
                "Nome= "+ getNome()+
                ", Sexo= "+ getSexo()+ 
                ", Turma= "+ getTurma()+
                ", matricula= " + this.matricula + 
                ", endereco= " + this.endereco + '}';
    }
    
    
    
    
    
}
