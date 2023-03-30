package lista02;

import java.util.Scanner;

public class Question01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int number = sc.nextInt();

        System.out.println("Tabuada de 1 a 10");
        for(int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", number, i, (number*i));
        }

        sc.close();
    }
}
