package lista06Q4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Pessoa pessoa = new Pessoa();

        System.out.print("Digite seu nome: ");
        pessoa.setNome(sc.nextLine());

        System.out.print("Digite seu logradouro, bairro, cidade, estado, cep e numero: ");
        String logradouro = sc.nextLine();
        String bairro = sc.nextLine();
        String cidade = sc.nextLine();
        String estado = sc.nextLine();
        String cep = sc.nextLine();
        int numero = sc.nextInt();

        Endereco endereco = new Endereco(logradouro, numero, bairro, cidade, estado, cep);
        pessoa.setEndereco(endereco);

        sc.nextLine();
        System.out.print("Digite seu dia, mes e ano de nascimento: ");
        int dia = sc.nextInt();
        int mes = sc.nextInt();
        int ano = sc.nextInt();

        Data data = new Data(dia, mes, ano);
        pessoa.setData(data);

        System.out.println("Seu nome é: " + pessoa.getNome());
        System.out.println(pessoa.getEndereco());
        System.out.println("Data de nascimento: " + pessoa.getData());
    }
}
