package lista06Q6;

public class Livro {
    private String nome;
    private int paginas;
    private Titulo titulo;
    private Autor autor;
    private Capitulo capitulo;
    private Editora editora;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public void setTitulo(String nome) {
        titulo.setNome(nome);
    }

    public void setAutor(String nome) {
        autor.setNome(nome);
    }

    public void setCapitulo(String nome) {
        capitulo.setNome(nome);
    }

    public void setEditora(String nome) {
        editora.setNome(nome);
    }
}
