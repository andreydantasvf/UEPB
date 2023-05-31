package entities;

public class Pessoa {
    protected String nome;
    protected String cpf;
    protected String dataNasc;

    public Pessoa() {
        super();
    }

    public Pessoa(String nome, String cpf, String dataNasc) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNasc = dataNasc;
    }
}
