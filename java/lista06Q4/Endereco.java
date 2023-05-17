package lista06Q4;

public class Endereco {
    private String logradouro;
    private int numero;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;

    public Endereco(String logradouro, int numero, String bairro, String cidade, String estado, String cep) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
    }

    public String toString() {
        return String.format("Endereco: [logradouro]: %s, [numero]: %d, [bairro]: %s, [cidade]: %s, [estado]: %s, [cep]: %s", logradouro, numero, bairro, cidade, estado, cep);
    }
}
