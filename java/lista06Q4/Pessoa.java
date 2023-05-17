package lista06Q4;

public class Pessoa {
    private String nome;
    private Endereco endereco;
    private Data data;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco.toString();
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getData() {
        return data.toString();
    }

    public void setData(Data data) {
        this.data = data;
    }
}
