package lista02;

import java.util.Scanner;

public class Question03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nomes[] = new String[3];
        int countA[] = new int[3];
        int countE[] = new int[3];
        int index = 0;

        for(int i = 0; i < nomes.length; i++) {
            System.out.print("Digite um nome: ");
            nomes[i] = sc.nextLine();
        }

        for(String nome : nomes) {
            char[] palavra = nome.toCharArray();

            for(char letra : palavra) {
                if(letra == 'A' || letra == 'a') {
                    countA[index]++;
                }
                else if(letra == 'E' || letra == 'e') {
                    countE[index]++;
                }
            }

            index++;
        }

        index = 0;
        for(String nome: nomes) {
            System.out.printf("O nome %s tem %d letras A e %d letras E\n", nome, countA[index], countE[index]);
            index++;
        }

        sc.close();
    }
}
