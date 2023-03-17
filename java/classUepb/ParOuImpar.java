package classUepb;

import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int number = sc.nextInt();

        if(number % 2 == 0) {
            System.out.printf("O numero %d é par.", number);
        } else {
            System.out.printf("O numero %d é impar.", number);
        }
    }
}
