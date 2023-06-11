package application;

import entities.Filme;
import entities.Tempo;

import java.util.ArrayList;
import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcao;
        ArrayList<Filme> filmes = new ArrayList();

        do {
            menu("Bem vindo ao CINEMA!");
            System.out.println("[1] - Comprar ingresso");
            System.out.println("[2] - Listar filmes");
            System.out.println("[3] - Adicionar filme");
            System.out.println("[4] - Rodar filme");
            System.out.println("[0] - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    comprarIngressos(filmes, sc);
                    break;
                case 2:
                    listarFilmes(filmes);
                    break;
                case 3:
                    adicionarFilme(filmes, sc);
                    break;
                case 4:
                    rodarFilme(filmes, sc);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente!");
            }
        } while (opcao != 0);
    }

    public static void menu(String titulo) {
        System.out.println("---------------------------");
        System.out.printf("  %s%n", titulo);
        System.out.println("---------------------------");
    }

    public static void comprarIngressos(ArrayList<Filme> filmes, Scanner sc) {
        menu("Compra de Ingressos");
        double valorIngresso = 10.90, totalValor = 0;

        System.out.print("Digite a quantidade de ingressos: ");
        int quantidade = sc.nextInt();

        for (int i = 0; i < quantidade; i++) {
            int opcaoFilme = escolherFilme(filmes, sc);

            menu("Sala do Cinema");
            listarCadeiras(filmes.get(opcaoFilme).getCadeiras());
            mostrarCadeirasOcupadas(filmes, opcaoFilme);

            if (escolherCadeira(sc, filmes, opcaoFilme)) {
                totalValor += valorIngresso;
            }
        }

        System.out.printf("Valor total: R$ %.2f%n", totalValor);
    }

    public static int escolherFilme(ArrayList<Filme> filmes, Scanner sc) {
        listarFilmes(filmes);
        System.out.print("Escolha um dos filmes: \n");
        int opcaoFilme = sc.nextInt();
        sc.nextLine();

        if (!filmeExiste(opcaoFilme, filmes)) {
            System.out.println("Não temos esse filme cadastrado!");
            return escolherFilme(filmes, sc);
        }
        return opcaoFilme;
    }

    public static void listarFilmes(ArrayList<Filme> filmes) {
        menu("Lista dos filmes");
        int aux = 0;
        for (Filme filme : filmes) {
            System.out.printf("[%d] - %s\n", aux, filme);
            aux++;
        }
    }

    public static Boolean filmeExiste(int opcaoFilme, ArrayList<Filme> filmes) {
        return opcaoFilme >= 0 && opcaoFilme < filmes.size();
    }

    public static void listarCadeiras(int[][] cadeiras) {
        int aux = cadeiras.length * cadeiras[0].length;
        for (int i = 0; i < cadeiras.length; i++) {
            for (int j = 0; j < cadeiras.length; j++) {
                System.out.printf("[%d] ", aux);
                aux--;
            }
            System.out.println();
        }
    }

    public static void mostrarCadeirasOcupadas(ArrayList<Filme> filmes, int opcaoFilme) {
        System.out.print("As seguintes cadeiras estao ocupadas: ");
        for (int cadeira : filmes.get(opcaoFilme).getCadeirasOcupadas()) {
            System.out.printf("%d ", cadeira);
        }
    }

    public static Boolean escolherCadeira(Scanner sc, ArrayList<Filme> filmes, int opcaoFilme) {
        System.out.print("\nEscolha uma cadeira: ");
        int cadeiraSelecionada = sc.nextInt();

        if (cadeiraEstaOcupada(cadeiraSelecionada, filmes.get(opcaoFilme).getCadeirasOcupadas())) {
            System.out.println("Essa cadeira ja esta ocupada.");
            return escolherCadeira(sc, filmes, opcaoFilme);
        }
        filmes.get(opcaoFilme).setCadeirasOcupadas(cadeiraSelecionada);
        System.out.println("Ingresso comprado com sucesso!");
        return true;
    }

    public static Boolean cadeiraEstaOcupada(int cadeiraSelecionada, ArrayList<Integer> cadeirasOcupadas) {
        return cadeirasOcupadas.contains(cadeiraSelecionada);
    }

    public static void adicionarFilme(ArrayList<Filme> filmes, Scanner sc) {
        System.out.print("Digite o nome do filme: ");
        String nome = sc.nextLine();
        System.out.print("Digite a quantidade de horas, minutos e segundos do filme[ex: 2 30 27]: ");
        int horas = sc.nextInt();
        int minutos = sc.nextInt();
        int segundos = sc.nextInt();
        Tempo tempoFilme = new Tempo(horas, minutos, segundos);
        System.out.print("Digite a classificação de idade do filme: ");
        int classificacao = sc.nextInt();
        sc.nextLine();
        System.out.print("Digite o horario do filme: ");
        String horario = sc.nextLine();
        Filme novoFilme = new Filme(nome, classificacao, horario, tempoFilme);
        filmes.add(novoFilme);
    }

    public static void rodarFilme(ArrayList<Filme> filmes, Scanner sc) {
        listarFilmes(filmes);
        System.out.print("Qual filme deseja iniciar: ");
        int index = sc.nextInt();

        System.out.printf("[1] - Play no filme: %s\n", filmes.get(index).getTitulo());
        System.out.printf("[2] - Pause no filme: %s\n", filmes.get(index).getTitulo());
        System.out.printf("[3] - Pause com aviso no filme: %s\n", filmes.get(index).getTitulo());
        System.out.println("Escolha uma opcao: ");
        int opcao = sc.nextInt();
        sc.nextLine();

        if(opcao == 2) {
            filmes.get(index).pause();
        }
        else if(opcao == 3) {
            System.out.print("Digte o aviso: ");
            String aviso = sc.nextLine();
            filmes.get(index).pause(aviso);
        }
        else {
            filmes.get(index).play();
        }
    }
}
