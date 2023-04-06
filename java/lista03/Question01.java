package lista03;

import java.util.Scanner;

public class Question01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int num = sc.nextInt();

        if(ehPar(num) == 1) {
            System.out.println("É par");
        } else {
            System.out.println("É impar");
        }

        sc.close();
    }
    public static int ehPar(int num) {
        if(num % 2 == 0) {
            return 1;
        } else {
            return 0;
        }
    }
}
