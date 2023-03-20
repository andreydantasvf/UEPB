package lista01;

import java.util.Scanner;

public class Question06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idade;

        System.out.print("Digite a sua idade: ");
        idade = sc.nextInt();

        if (idade < 16) {
            System.out.println("Nao eleitor");
        }
        else if(idade < 18) {
            System.out.println("Eleitor facultativo");
        }
        else if(idade <= 65) {
            System.out.println("Eleitor obrigatorio");
        }
        else {
            System.out.println("Eleitor Facultativo");
        }

        sc.close();
    }
}
