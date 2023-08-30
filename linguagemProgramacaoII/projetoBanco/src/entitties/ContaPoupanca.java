package entitties;

public class ContaPoupanca extends ContaBancaria {
    private double taxaRendimento;

    public ContaPoupanca(String titular, Data dataCriacao) {
        super(titular, dataCriacao);
        this.taxaRendimento = 0.01;
    }

    public void depositar(double valor, boolean aumentarTaxaRendimento) {
        if (aumentarTaxaRendimento) {
            saldo += valor - 5.00;
            taxaRendimento += 0.003;
            System.out.println("Deposito realizado com sucesso!");
        } else {
            super.depositar(valor);
        }
    }

    public String toString() {
        return super.toString() + ", Taxa de Rendimento: " + (taxaRendimento * 100) + "%";
    }
}
