package entities;

public class Tempo {
    private int horas;
    private int minutos;
    private int segundos;

    public Tempo(int horas, int minutos, int segundos) {
        super();
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public String toString() {
        return this.horas + "h " + this.minutos + "min " + this.segundos + "seg\n";
    }
}
