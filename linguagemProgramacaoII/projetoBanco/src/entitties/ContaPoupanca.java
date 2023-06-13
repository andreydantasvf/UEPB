package entitties;

public class ContaPoupanca extends ContaBancaria {
    private double taxaRendimento;

    public ContaPoupanca(String titular) {
        super(titular);
        this.taxaRendimento = 0.01;
    }

    public void sacar(double valor, boolean aumentarTaxaRendimento) {
        if (aumentarTaxaRendimento) {
            if (valor <= saldo - 5.00) {
                saldo -= valor + 5.00;
                taxaRendimento += 0.005;
                System.out.println("Saque realizado com sucesso!");
            } else {
                System.out.println("Saldo insuficiente!");
            }
        } else {
            super.sacar(valor);
        }
    }

    public String toString() {
        return super.toString() + ", Taxa de Rendimento: " + (taxaRendimento * 100) + "%";
    }
}
