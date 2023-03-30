package lista02;

import java.util.Scanner;

public class Question02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float sal = 0, somaSal = 0, maiorSal = 0, mediaSal = 0, mediaFilhos = 0;
        int countSal = 0, countFilhos = 0, filhos = 0, somaFilhos = 0;

        do {
            System.out.print("\nDigite o seu salario (-1 para parar): ");
            sal = sc.nextFloat();

            if(sal != -1) {
                somaSal += sal;
                countSal++;

                if(sal > maiorSal) {
                    maiorSal = sal;
                }

                System.out.print("Digite a quantidade de filhos: ");
                filhos = sc.nextInt();
                somaFilhos += filhos;
                countFilhos++;

                mediaSal = somaSal / countSal;
                mediaFilhos = somaFilhos / countFilhos;
            }
        }while(sal != -1);

        System.out.printf("Media de salario: %.2f\n", mediaSal);
        System.out.printf("Media de filhos: %.2f\n", mediaFilhos);
        System.out.printf("Maior salario: %.2f\n", maiorSal);

        sc.close();
    }
}
