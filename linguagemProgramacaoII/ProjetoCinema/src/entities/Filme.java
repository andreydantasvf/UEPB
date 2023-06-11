package entities;

import java.util.ArrayList;

public class Filme extends Video {
    private String horario;
    private Tempo tempo;
    private int cadeiras[][] = new int[5][5];
    private ArrayList<Integer> cadeirasOcupadas = new ArrayList();

    public Filme(String titulo, int classificacao, String horario, Tempo tempo) {
        super(titulo, classificacao);
        this.horario = horario;
        this.tempo = tempo;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
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

    public String toString() {
        return String.format("Nome: %s; Tempo: %s; Horario: %s; Classificação: %d anos", this.getTitulo(), this.tempo, this.getHorario(), this.getClassificacao());
    }

    public void play() {
        System.out.printf("Play no filme %s\n", this.getTitulo());
    }

    public void pause(String aviso) {
        System.out.printf("Filme pausado por: %s\n", aviso);
    }
}
