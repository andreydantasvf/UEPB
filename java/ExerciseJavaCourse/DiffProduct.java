package ExerciseJavaCourse;

import java.util.Scanner;

public class DiffProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = 0, n2 = 0, n3 = 0, n4 = 0, diff = 0;

        System.out.println("Digite quatro números inteiros: ");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        n3 = sc.nextInt();
        n4 = sc.nextInt();

        diff = (n1 * n2) - (n3 * n4);

        System.out.println("Diferença = " + diff);

        sc.close();
    }
}
