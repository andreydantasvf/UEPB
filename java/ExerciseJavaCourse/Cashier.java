package ExerciseJavaCourse;

import java.util.Scanner;

public class Cashier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cod = 0, quant = 0;
        float value = 0, total = 0;

        System.out.println("Digite o código, a quantidade e o valor da peça 1: ");
        cod = sc.nextInt();
        quant = sc.nextInt();
        value = sc.nextFloat();
        total += quant * value;

        System.out.println("Digite o código, a quantidade e o valor da peça 2: ");
        cod = sc.nextInt();
        quant = sc.nextInt();
        value = sc.nextFloat();
        total += quant * value;

        System.out.printf("VALOR A PAGAR: %.2f%n", total);

        sc.close();
    }
}
