package lista04;

import java.util.Scanner;

public class Inicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Conta contaCorrente = new Conta();
        Conta contaPoupanca = new Conta();

        System.out.print("Digite um valor para adicionar em sua conta corrente: ");
        double valor = sc.nextDouble();

        contaCorrente.setDinheiro(valor);

        System.out.printf("Sua conta corrente possui o saldo de: %.2f%n", contaCorrente.getDinheiro());
    }
}
