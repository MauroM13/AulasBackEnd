package model;

// Classe de árvore compartilhada (Flyweight)
public class ArvoreCompartilhada {
    private int altura;
    private int largura;
    private String cor;

    public ArvoreCompartilhada(int altura, int largura, String cor) {
        this.altura = altura;
        this.largura = largura;
        this.cor = cor;
    }

    // Getters

    public int getAltura() {
        return altura;
    }

    public int getLargura() {
        return largura;
    }

    public String getCor() {
        return cor;
    }
}
