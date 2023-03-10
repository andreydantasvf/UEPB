package ExerciseJavaCourse;

import java.util.Scanner;

public class Areas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = 0, b = 0, c = 0, area = 0;

        System.out.println("Digite três valores: ");
        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();

        area = (a * c)/ 2;
        System.out.printf("Área DO TRIÂNGULO: %.3f%n", area);

        area = 3.14159 * Math.pow(c, 2);
        System.out.printf("Área DO CÍRCULO: %.3f%n", area);

        area = ((a + b) * c) / 2;
        System.out.printf("Área DO TRAPÉZIO: %.3f%n", area);

        area = b * b;
        System.out.printf("Área DO CÍRCULO: %.3f%n", area);

        area = a * b;
        System.out.printf("Área DO RETÂNGULO: %.3f%n", area);

        sc.close();
    }
}
