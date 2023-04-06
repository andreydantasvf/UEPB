package lista03;

import java.util.Scanner;

public class Question02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a nota1: ");
        float nota1 = sc.nextFloat();

        System.out.print("Digite a nota2: ");
        float nota2 = sc.nextFloat();

        System.out.print("Digite a nota3: ");
        float nota3 = sc.nextFloat();

        System.out.print("Digite A para media aritmetica ou P para media ponderada: ");
        char opcao = sc.next().charAt(0);

        float mediaTotal = media(nota1, nota2, nota3, opcao);

        System.out.printf("A media é: %.2f", mediaTotal);

        sc.close();
    }
    public static float media(float n1, float n2, float n3, char letra) {
        switch (letra) {
            case 'A':
                return (n1 + n2 + n3) / 3;
            case 'P':
                return ((n1 * 5) + (n2 * 3) + (n3 * 2)) / (5 + 3 + 2);
            default:
                System.out.println("Opcao invalida");
                return 0;
        }
    }
}
