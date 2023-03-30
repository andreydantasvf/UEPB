package lista02;

import java.util.Scanner;

public class Question06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de linhas da matriz: ");
        int rows = sc.nextInt();

        System.out.print("Digite a quantidade de colunas da matriz: ");
        int cols = sc.nextInt();

        int matriz[][] = new int[rows][cols];

        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                System.out.printf("Digite um valor para a posicao [%d][%d] da matriz: ", (i+1), (j+1));
                matriz[i][j] = sc.nextInt();
            }
        }

        int matrizTransposta[][] = new int[cols][rows];

        for(int i = 0; i < matrizTransposta.length; i++) {
            for(int j = 0; j < matrizTransposta[i].length; j++) {
                matrizTransposta[i][j] = matriz[j][i];
            }
        }

        System.out.println("Sua matriz transposta: ");
        for(int vetor[] : matrizTransposta) {
            for(int number : vetor) {
                System.out.print(number + " ");
            }
            System.out.println("");
        }

        sc.close();
    }
}
