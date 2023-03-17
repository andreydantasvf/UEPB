package classUepb;

import java.util.Scanner;

public class Ingresso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char option;
        double valor = 0;

        System.out.println("Seja bem vindo ao nosso cinema!");
        System.out.println("E - Estudante");
        System.out.println("A - Aposentado");
        System.out.println("N - Normal");
        System.out.print("Escolha a sua categorias: ");
        option = sc.next().charAt(0);

        switch (option) {
            case 'E':
                valor = 24 * 0.5;
                System.out.printf("Valor do seu ingresso: R$ %.2f%n", valor);
                break;
            case 'A':
                valor = 24 * 0.3;
                System.out.printf("Valor do seu ingresso: R$ %.2f%n", valor);
                break;
            case 'N':
                valor = 24;
                System.out.printf("Valor do seu ingresso: R$ %.2f%n", valor);
                break;
            default:
                System.out.println("Opcao invalida.");
                break;
        }
    }
}
