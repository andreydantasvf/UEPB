package entities;

public class Gerente extends Funcionario{
    protected int area;

    public Gerente() {
        super();
    }

    public Gerente(String nome, String cpf, String matricula, double salario, int area) {
        super(nome, cpf, matricula, salario);
        this.area = area;
    }

    @Override
    public void mostraDados() {
        System.out.printf("Nome: %s, CPF: %s, Matricula: %s, Salario: %.2f, Area: %d", this.nome, this.cpf, this.matricula, this.salario, this.area);
    }
}
