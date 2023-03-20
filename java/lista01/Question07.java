package lista01;

import java.util.Scanner;

public class Question07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcao;
        double totalCal;

        System.out.println("1 - Italiano e Chá 30 cal");
        System.out.println("2 - Japonês e Suco de laranja");
        System.out.println("3 - Salvadoreno e Refrigerante");
        System.out.print("Escolha uma das opcoes: ");
        opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                totalCal = 750 + 30;
                System.out.println("Total de calorias: " + totalCal);
                break;
            case 2:
                totalCal = 342 + 80;
                System.out.println("Total de calorias: " + totalCal);
                break;
            case 3:
                totalCal = 545 + 90;
                System.out.println("Total de calorias: " + totalCal);
                break;
            default:
                System.out.println("Opcao invalida");
                break;
        }

        sc.close();
    }
}
