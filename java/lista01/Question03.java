package lista01;

import java.util.Scanner;

public class Question03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome de um aluno: ");
        String nome = sc.nextLine();
        System.out.print("Digite a disciplina: ");
        String disciplina = sc.nextLine();
        System.out.print("Digite as quatro notas do aluno na disciplina: ");
        double nota1 = sc.nextDouble();
        double nota2 = sc.nextDouble();
        double nota3 = sc.nextDouble();
        double nota4 = sc.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.printf("O aluno %s ficou com media %.2f na disciplina %s%n", nome, media, disciplina);

        sc.close();
    }
}
