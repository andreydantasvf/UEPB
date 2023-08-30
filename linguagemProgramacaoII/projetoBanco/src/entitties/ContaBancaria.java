package entitties;

public class ContaBancaria {
    protected String titular;
    protected double saldo;
    protected Data dataCriacao;

    public ContaBancaria(String titular, Data dataCriacao) {
        this.titular = titular;
        this.dataCriacao = dataCriacao;
        this.saldo = 0.0;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Deposito realizado com sucesso!");
    }

    public void sacar(double valor) {
        if(valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public String toString() {
        return "Titular: " + titular + ", Saldo: R$ " + saldo;
    }
}
