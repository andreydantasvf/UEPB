package lista01;

import java.util.Scanner;

public class Question05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double deposito, taxa;

        System.out.print("Digite o valor do deposito: ");
        deposito = sc.nextDouble();
        System.out.print("Digite a taxa de juros: ");
        taxa = sc.nextDouble();

        double juros = (deposito * taxa / 100);
        double total = deposito + juros;

        System.out.printf("Seu dinheiro rendeu %.2f e o total ficou: R$ %.2f%n", juros, total);

        sc.close();
    }
}
