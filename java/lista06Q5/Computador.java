package lista06Q5;

public class Computador {
    private String marca;
    private Memoria memoria;
    private Monitor monitor;
    private PlacaMae placaMae;
    private Teclado teclado;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public void setMemoria(Memoria memoria) {
        this.memoria = memoria;
    }

    public void setPlacaMae(PlacaMae placaMae) {
        this.placaMae = placaMae;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }
}
