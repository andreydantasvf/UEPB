package entities;

public class Funcionario extends Pessoa {
    protected String matricula;
    protected String dataAdmissao;
    protected double salario;

    public Funcionario() {
        super();
    }

    public Funcionario(String nome, String cpf, String dataNasc, String matricula, String dataAdmissao, double salario) {
        super(nome, cpf, dataNasc);
        this.matricula = matricula;
        this.dataAdmissao = dataAdmissao;
        this.salario = salario;
    }
}
