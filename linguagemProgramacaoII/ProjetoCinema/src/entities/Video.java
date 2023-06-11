package entities;

public class Video {
    private String titulo;
    private int classificacao;

    public Video() {
        super();
    }

    public Video(String titulo, int classificacao) {
        super();
        this.titulo = titulo;
        this.classificacao = classificacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
    }

    public void play() {
        System.out.println("Play video");
    }

    public void pause() {
        System.out.println("Pause video");
    }
}
