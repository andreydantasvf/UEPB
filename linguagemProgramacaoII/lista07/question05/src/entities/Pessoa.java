package entities;

public class Pessoa {
    protected String nome;
    protected String cpf;

    public Pessoa() {
        super();
    }

    public Pessoa(String nome, String cpf) {
        super();
        this.nome = nome;
        this.cpf = cpf;
    }

    public void mostraDados() {
        System.out.printf("Nome: %s, CPF: %s\n", this.nome, this.cpf);
    }
}
