package projetoCinema;

import java.util.ArrayList;
import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcao;
        ArrayList<Filme> filmes = new ArrayList();
        ArrayList<Integer> cadeirasOcupadas = new ArrayList();

        do {
            menu("Bem vindo ao CINEMA!");
            System.out.println("[1] - Comprar ingresso");
            System.out.println("[2] - Listar filmes");
            System.out.println("[3] - Adicionar filme");
            System.out.println("[0] - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    menu("Sala do Cinema");
                    listarCadeiras();

                    System.out.print("As seguintes cadeiras estao ocupadas: ");
                    for (int cadeira : cadeirasOcupadas) {
                        System.out.printf("%d ", cadeira);
                    }

                    System.out.print("\nEscolha uma cadeira: ");
                    int cadeiraSelecionada = sc.nextInt();

                    if(verificarCadeiraOcupada(cadeiraSelecionada, cadeirasOcupadas)) {
                        System.out.println("Essa cadeira ja esta ocupada.");
                    } else {
                        cadeirasOcupadas.add(cadeiraSelecionada);
                    }
                    break;
                case 2:
                    menu("Lista dos filmes");
                    for(Filme filme : filmes) {
                        System.out.printf("Nome: %s%n", filme.nome);
                        System.out.printf("Data: %s%n", filme.data);
                        System.out.printf("Horario: %s%n%n", filme.horario);
                    }
                    break;
                case 3:
                    System.out.print("Digite o nome do filme: ");
                    String nome = sc.nextLine();
                    System.out.print("Digite a data de estreia do filme: ");
                    String data = sc.nextLine();
                    System.out.print("Digite o horario do filme: ");
                    String horario = sc.nextLine();

                    Filme novoFilme = new Filme(nome, data, horario);
                    filmes.add(novoFilme);
                    break;
                case 0:
                    System.out.println("Valeu chef!");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente!");
            }
        } while (opcao != 0);


        sc.close();
    }

    public static Boolean verificarCadeiraOcupada(int cadeiraSelecionada, ArrayList<Integer> cadeirasOcupadas) {
        for(int cadeira : cadeirasOcupadas) {
            if(cadeira == cadeiraSelecionada) {
                return true;
            }
        }
        return false;
    }

    public static void listarCadeiras() {
        int cadeiras[][] = new int[5][5];

        int aux = cadeiras.length * cadeiras[0].length;
        for (int i = 0; i < cadeiras.length; i++) {
            for (int j = 0; j < cadeiras.length; j++) {
                System.out.printf("[%d] ", aux);
                aux--;
            }
            System.out.println();
        }
    }

    public static void menu(String titulo) {
        System.out.println("---------------------------");
        System.out.printf("  %s%n", titulo);
        System.out.println("---------------------------");
    }
}
