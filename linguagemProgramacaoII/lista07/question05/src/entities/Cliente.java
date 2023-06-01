package entities;

public class Cliente extends Pessoa{
    protected int codigo;

    public Cliente() {
        super();
    }

    public Cliente(String nome, String cpf, int codigo) {
        super(nome, cpf);
        this.codigo = codigo;
    }

    public void mostraDados() {
        super.mostraDados();
        System.out.printf("Código cliente: %d\n", this.codigo);
    }
}
