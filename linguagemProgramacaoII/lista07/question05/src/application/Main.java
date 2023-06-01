package application;

import entities.Cliente;
import entities.Funcionario;
import entities.Gerente;
import entities.Pessoa;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Andrey", "12332131");
        Cliente cliente = new Cliente("Mika", "213123", 123);
        Funcionario funcionario = new Funcionario("Joao", "1312312", "123123", 1200);
        Gerente gerente = new Gerente("Maria", "123213123", "1231231", 1500, 1);

        pessoa.mostraDados();
        System.out.println("-------------------");
        cliente.mostraDados();
        System.out.println("-------------------");
        funcionario.mostraDados("Oi, funcionario");
        System.out.println("-------------------");
        gerente.mostraDados();
    }
}
