package ExerciseJavaCourse;

import java.util.Scanner;

public class IsNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number;

        System.out.print("Digite um numero: ");
        number = sc.nextInt();

        if(number < 0) {
            System.out.println("É negativo!");
        } else {
            System.out.println("NÃO é negativo!");
        }
    }
}
