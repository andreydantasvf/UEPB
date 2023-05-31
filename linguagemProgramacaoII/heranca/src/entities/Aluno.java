package entities;

public class Aluno extends Pessoa {
    protected String matricula;

    public Aluno() {
        super();
    }

    public Aluno(String nome, String cpf, String dataNasc, String matricula) {
        super(nome, cpf, dataNasc);
        this.matricula = matricula;
    }
}
