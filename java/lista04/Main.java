package lista04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu CPF: ");
        String cpf = sc.nextLine();

        System.out.print("Digite seu tipo de conta: ");
        String tipoConta = sc.nextLine();

        Conta conta = new Conta(tipoConta);
        Cliente cliente = new Cliente(cpf, conta);

        int opcao = 0;

        do {
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opcao: ");
            opcao = sc.nextInt();
            double valor = 0;

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor: ");
                    valor = sc.nextDouble();
                    cliente.conta.depositar(valor);
                    System.out.println(cliente.conta.toString());
                    break;
                case 2:
                    System.out.print("Digite o valor: ");
                    valor = sc.nextDouble();
                    cliente.conta.sacar(valor);
                    System.out.println(cliente.conta.toString());
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opcao invalida!");
                    break;
            }
        } while (opcao != 0);
    }
}
