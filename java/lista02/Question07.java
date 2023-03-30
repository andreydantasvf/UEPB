package lista02;

import java.util.Scanner;

public class Question07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int matrizA[][] = new int[5][5];
        int matrizB[][] = new int[5][5];

        for(int i = 0; i < matrizA.length; i++) {
            for(int j = 0; j < matrizA[i].length; j++) {
                System.out.printf("Digite um valor para a posicao [%d][%d] da matrizA: ", (i+1), (j+1));
                matrizA[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < matrizB.length; i++) {
            for(int j = 0; j < matrizB[i].length; j++) {
                System.out.printf("Digite um valor para a posicao [%d][%d] da matrizB: ", (i+1), (j+1));
                matrizB[i][j] = sc.nextInt();
            }
        }

        int matrizSoma[][] = new int[5][5];
        int matrizSubtracao[][] = new int[5][5];

        for(int i = 0; i < matrizSoma.length; i++) {
            for(int j = 0; j < matrizSoma[i].length; j++) {
                matrizSoma[i][j] = matrizA[i][j] + matrizB[i][j];
                matrizSubtracao[i][j] = matrizA[i][j] - matrizB[i][j];
            }
        }

        System.out.println("A soma das matrizes: ");
        for(int vetor[] : matrizSoma) {
            for(int number : vetor) {
                System.out.print(number + " ");
            }
            System.out.println("");
        }

        System.out.println("A subtracao das matrizes: ");
        for(int vetor[] : matrizSubtracao) {
            for(int number : vetor) {
                System.out.print(number + " ");
            }
            System.out.println("");
        }
        sc.close();
    }
}
