package lista03;

import java.util.Scanner;

public class Question03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Digite uma string: ");
        String palavra1 = sc.nextLine();

        System.out.printf("Digite outra string: ");
        String palavra2 = sc.nextLine();

        if(palavra1.equals(palavra2)) {
            System.out.println("Palavras string iguais");
        } else {
            System.out.println("Palavras concatenadas: " + palavra1 + palavra2);
        }

        sc.close();
    }
}
