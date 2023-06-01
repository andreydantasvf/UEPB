package entities;

public class Funcionario extends Pessoa{
    protected String matricula;
    protected double salario;

    public Funcionario() {
        super();
    }

    public Funcionario(String nome, String cpf, String matricula, double salario) {
        super(nome, cpf);
        this.matricula = matricula;
        this.salario = salario;
    }

    public void mostraDados(String texto) {
        System.out.println(texto);
        super.mostraDados();
        System.out.printf("Matricula do funcionario: %s, Salario: %.2f\n", this.matricula, this.salario);
    }
}
