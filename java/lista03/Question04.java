package lista03;

import java.util.Scanner;

public class Question04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int n = sc.nextInt();

        int total = soma(n);

        System.out.printf("O total é: %d", total);

        sc.close();
    }

    public static int soma(int n) {
        if(n == 1) {
            return 1;
        } else if(n <= 0) {
            System.out.println("Numero é menor que 1");
            return 0;
        }

        return n + soma(n-1);
    }
}
