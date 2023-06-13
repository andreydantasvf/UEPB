package entitties;

public class ContaPoupanca extends ContaBancaria {
    private double taxaRendimento;

    public ContaPoupanca(String titular) {
        super(titular);
        this.taxaRendimento = 0.01;
    }

    public void depositar(double valor, boolean aumentarTaxaRendimento) {
        if (aumentarTaxaRendimento) {
            saldo += valor - 5.00;
            taxaRendimento += 0.003;
            System.out.println("Deposito realizado com sucesso!");
        } else {
            super.sacar(valor);
        }
    }

    public String toString() {
        return super.toString() + ", Taxa de Rendimento: " + (taxaRendimento * 100) + "%";
    }
}
