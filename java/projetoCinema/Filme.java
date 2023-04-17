package projetoCinema;

import java.util.ArrayList;

public class Filme {
    String nome;
    int classificacao;
    String horario;
    int cadeiras[][] = new int[5][5];
    ArrayList<Integer> cadeirasOcupadas = new ArrayList();

    public Filme(String nome, int classificacao, String horario) {
        this.nome = nome;
        this.classificacao = classificacao;
        this.horario = horario;
    }

    public int[][] getCadeiras() {
        return cadeiras;
    }

    public ArrayList<Integer> getCadeirasOcupadas() {
        return cadeirasOcupadas;
    }

    public void setCadeirasOcupadas(int cadeira) {
        cadeirasOcupadas.add(cadeira);
    }
}
