package lista05;

public class Carro {
    String marca;
    String modelo;
    int ano;
    String combustivel;

    public Carro(String marca, String modelo, int ano, String combustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.combustivel = combustivel;
    }

    public void ligar() {
        System.out.println("Carro ligado!");
    }

    public void desligar() {
        System.out.println("Carro desligado!");
    }

    public void acelerar() {
        System.out.println("Acelerando...");
    }

    public void frear() {
        System.out.println("Freando...");
    }
}
