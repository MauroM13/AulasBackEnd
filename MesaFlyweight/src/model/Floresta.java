package model;

import factory.ArvoreFactory;
import model.ArvoreCompartilhada;

public class Floresta<Arvore> {
    private ArvoreFactory arvoreCompartilhadaFactory;
    private int quantidadeArvores;

    public Floresta() {
        arvoreCompartilhadaFactory = new ArvoreFactory();
        quantidadeArvores = 0;
    }

    public void plantarArvore(int altura, int largura, String cor) {
        ArvoreCompartilhada arvoreCompartilhada = arvoreCompartilhadaFactory.getArvoreCompartilhada(altura, largura, cor);
        quantidadeArvores++;
    }

    public void exibirQuantidadeArvores() {
        System.out.println("Quantidade de árvores: " + quantidadeArvores);
    }
}