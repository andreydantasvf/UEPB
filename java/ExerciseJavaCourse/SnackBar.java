package ExerciseJavaCourse;

import java.util.Scanner;

public class SnackBar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int id, quant;
        double total = 0;

        System.out.print("Digite o código do produto e a quantidade: ");
        id = sc.nextInt();
        quant = sc.nextInt();

        switch (id) {
            case 1:
                total = 4.00 * quant;
                break;
            case 2:
                total = 4.50 * quant;
                break;
            case 3:
                total = 5.00 * quant;
                break;
            case 4:
                total = 2.00 * quant;
                break;
            case 5:
                total = 1.50 * quant;
                break;
            default:
                System.out.println("Código inválido!");
        }

        System.out.printf("Total: R$ %.2f%n", total);
    }
}
