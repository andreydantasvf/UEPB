package ExerciseJavaCourse;

import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final double pi = 3.14159;
        double raio = 0, area = 0;

        System.out.print("Digite o raio do círculo: ");
        raio = sc.nextDouble();

        area = pi * Math.pow(raio, 2);

        System.out.printf("A área do círculo é: %.4f%n", area);

        sc.close();
    }
}
