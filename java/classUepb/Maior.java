package classUepb;

import java.util.Scanner;

public class Maior {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number1, number2;

        System.out.print("Digite dois números: ");
        number1 = sc.nextInt();
        number2 = sc.nextInt();

        if(number1 > number2) {
            System.out.printf("O número %d é o maior.", number1);
        }
        else if(number2 > number1) {
            System.out.printf("O número %d é o maior.", number2);
        }
        else {
            System.out.printf("Os números %d e %d são iguais.", number1, number2);
        }
    }
}
