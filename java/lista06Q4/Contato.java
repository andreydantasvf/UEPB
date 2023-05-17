package lista06Q4;

public class Contato {
    private String telefoneResid;
    private String celular;
    private String email;

    public Contato(String telefoneResid, String celular, String email) {
        this.telefoneResid = telefoneResid;
        this.celular = celular;
        this.email = email;
    }

    public String toString() {
        return String.format("Telefone residencial: %s, Celular: %s, Email: %s", telefoneResid, celular, email);
    }
}
