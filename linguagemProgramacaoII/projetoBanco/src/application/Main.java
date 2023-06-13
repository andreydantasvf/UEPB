package application;

import entitties.ContaCorrente;
import entitties.ContaPoupanca;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcaoMenuPrincipal = 1;

        System.out.print("Digite o seu nome: ");
        String titular = sc.nextLine();

        do {
            System.out.printf("\n\nOla, %s!\n", titular);
            System.out.println("[1] - Entrar na Poupanca");
            System.out.println("[2] - Entrar na Corrente");
            System.out.println("[0] - Sair");
            System.out.print("Escolha uma opcao: ");
            opcaoMenuPrincipal = sc.nextInt();

            switch (opcaoMenuPrincipal) {
                case 1:
                    menuContaPoupanca(titular, sc);
                    break;
                case 2:
                    menuContaCorrente(titular, sc);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opcao invalida, tente novamente.");
                    break;
            }

        }while(opcaoMenuPrincipal != 0);
    }

    public static void menuContaPoupanca(String titular, Scanner sc) {
        ContaPoupanca contaPoupanca = new ContaPoupanca(titular);
        int opcaoMenuConta = 1;

        do {
            System.out.println("\n\n[1] - Realizar Deposito");
            System.out.println("[2] - Realizar Saque");
            System.out.println("[3] - Realizar Saque e aumentar a taxa de rendimento");
            System.out.println("[4] - Ver Detalhes da Conta");
            System.out.println("[0] - Sair");
            System.out.print("Escolha uma opcao: ");
            opcaoMenuConta = sc.nextInt();

            double valor;
            switch (opcaoMenuConta) {
                case 1:
                    System.out.print("Digite o valor do seu deposito: ");
                    valor = sc.nextDouble();
                    contaPoupanca.depositar(valor);
                    break;
                case 2:
                    System.out.print("Digite o valor que deseja sacar: ");
                    valor = sc.nextDouble();
                    contaPoupanca.sacar(valor);
                    break;
                case 3:
                    System.out.print("Digite o valor que deseja sacar: ");
                    valor = sc.nextDouble();
                    contaPoupanca.sacar(valor, true);
                    break;
                case 4:
                    System.out.println(contaPoupanca);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opcao invalida, tente novamente.");
                    break;
            }
        } while(opcaoMenuConta != 0);
    }

    public static void menuContaCorrente(String titular, Scanner sc) {
        ContaCorrente contaCorrente = new ContaCorrente(titular, 50.00);
        int opcaoMenuConta = 1;

        do {
            System.out.println("\n\n[1] - Realizar Deposito");
            System.out.println("[2] - Realizar Saque");
            System.out.println("[3] - Ver Detalhes da Conta");
            System.out.println("[0] - Sair");
            System.out.print("Escolha uma opcao: ");
            opcaoMenuConta = sc.nextInt();

            double valor;
            switch (opcaoMenuConta) {
                case 1:
                    System.out.print("Digite o valor do seu deposito: ");
                    valor = sc.nextDouble();
                    contaCorrente.depositar(valor);
                    break;
                case 2:
                    System.out.print("Digite o valor que deseja sacar: ");
                    valor = sc.nextDouble();
                    contaCorrente.sacar(valor);
                    break;
                case 3:
                    System.out.println(contaCorrente);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opcao invalida, tente novamente.");
                    break;
            }
        } while(opcaoMenuConta != 0);
    }
}
