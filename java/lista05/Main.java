package lista05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a marca do carro: ");
        String marca = sc.nextLine();

        System.out.print("Digite o modelo do carro: ");
        String modelo = sc.nextLine();

        System.out.print("Digite o tipo de combustivel do carro: ");
        String combustivel = sc.nextLine();

        System.out.print("Digite o ano do carro: ");
        int ano = sc.nextInt();

        Carro carro = new Carro(marca, modelo, ano, combustivel);

        int opcao = 0;

        do {
            System.out.println("1 - Ligar o carro");
            System.out.println("2 - Desligar o carro");
            System.out.println("3 - Acelerar o carro");
            System.out.println("4 - Frear o carro");
            System.out.println("0 - Sair");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    carro.ligar();
                    break;
                case 2:
                    carro.desligar();
                    break;
                case 3:
                    carro.acelerar();
                    break;
                case 4:
                    carro.frear();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opcao invalida, tente novamente!");
                    break;
            }
        } while(opcao != 0);
        sc.close();
    }
}
