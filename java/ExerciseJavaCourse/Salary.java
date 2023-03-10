package ExerciseJavaCourse;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int id = 0, hours = 0;
        double value = 0, salary = 0;

        System.out.print("Digite o id do funcionário: ");
        id = sc.nextInt();

        System.out.print("Digite a quantidade de horas trabalhadas do funcionário: ");
        hours = sc.nextInt();

        System.out.print("Digite o valor da hora por hora do funcionário: ");
        value = sc.nextDouble();

        salary = value * hours;

        System.out.println("NUMBER = " + id);
        System.out.printf("SALARY = U$ %.2f%n", salary);

        sc.close();
    }
}
