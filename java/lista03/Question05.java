package lista03;

import java.util.Scanner;

public class Question05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Filmes listaFilmes[] = new Filmes[3];

        for(int i = 0; i < 3; i++) {
            System.out.printf("Digite o nome do filme 0%d: ", i+1);
            String nome = sc.nextLine();

            System.out.printf("Digite o nome do autor filme 0%d: ", i+1);
            String autor = sc.nextLine();

            System.out.printf("Digite o ano do filme 0%d: ", i+1);
            int ano = sc.nextInt();

            System.out.printf("Digite o valor do filme 0%d: ", i+1);
            float preco = sc.nextFloat();
            sc.nextLine();

            listaFilmes[i] = new Filmes(nome, autor, ano, preco);
        }

        System.out.println("\nSeus filmes: ");

        for(Filmes filme : listaFilmes) {
            System.out.printf("Nome: %s\n", filme.nome);
            System.out.printf("Autor: %s\n", filme.autor);
            System.out.printf("Ano: %d\n", filme.ano);
            System.out.printf("Preco: %.2f\n\n", filme.preco);
        }

        sc.close();
    }
}
