package application;

import entities.Aluno;
import entities.ChefeDepartamento;
import entities.Funcionario;
import entities.Pessoa;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Joao", "1234", "14/01/2005");
        Aluno aluno = new Aluno("Maria", "12345", "01/01/2005", "12323123");
        Funcionario funcionario = new Funcionario("Maria", "12345", "01/01/2005", "12323123", "22/03/2021", 1200);
        ChefeDepartamento chefeDepartamento = new ChefeDepartamento("Maria", "12345", "01/01/2005", "12323123", "22/03/2021", 1200, "dep01", "30/05/2022", 800);
    }
}
