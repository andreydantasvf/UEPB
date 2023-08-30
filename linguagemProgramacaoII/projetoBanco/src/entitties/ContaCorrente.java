package entitties;

public class ContaCorrente extends ContaBancaria {
    private double limiteChequeEspecial;

    public ContaCorrente(String titular, Data dataCriacao, double limiteChequeEspecial) {
        super(titular, dataCriacao);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public void setLimiteChequeEspecial(double limiteChequeEspecial) {
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public void sacar(double valor) {
        if(valor <= saldo + limiteChequeEspecial) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public String toString() {
        return super.toString() + ", Limite Cheque Especial: R$ " + limiteChequeEspecial;
    }
}
