package lista06Q7;

public class Monstro {
    private String nome;
    private Cabeca cabeca;
    private Olho olho;
    private Boca boca;
    private Braco braco;
    private Perna perna;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCabeca(float tamanho) {
        this.cabeca.setTamanho(tamanho);
    }

    public void setOlho(String cor) {
        this.olho.setCor(cor);
    }

    public void setBoca(String cor) {
        this.boca.setCor(cor);
    }

    public void setBraco(float tamanho) {
        this.braco.setTamanho(tamanho);
    }

    public void setPerna(float tamanho) {
        this.perna.setTamanho(tamanho);
    }
}
