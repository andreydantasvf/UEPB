package lista02;

import java.util.Scanner;

public class Question05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float notas[][] = new float[5][2];

        for(int i = 0; i < notas.length; i++) {
            for(int j = 0; j < notas[i].length; j++) {
                System.out.printf("Digite a nota %d do Aluno %d: ", (j+1), (i+1));
                notas[i][j] = sc.nextFloat();
            }
        }

        for(int i = 0; i < notas.length; i++) {
            float somaNotas = 0;
            for(int j = 0; j < notas[i].length; j++) {
                somaNotas += notas[i][j];
            }

            float media = somaNotas / notas[i].length;

            System.out.printf("A media do aluno %d foi: %.2f", (i+1), media);
            if(media < 7) {
                System.out.print(". Está reprovado!\n");
            } else {
                System.out.print(". Está Aprovado!\n");
            }
        }


        sc.close();
    }
}
