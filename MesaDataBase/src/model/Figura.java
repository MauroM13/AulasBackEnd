package model;

import java.util.List;

public abstract class Figura {
    protected int id;
    protected String cor;

    public Figura(int id, String nome, String tipo, String cor) {
        this.id = id;
        this.cor = cor;
    }

    public static List<Figura> consultarPorCor(String vermelho) {
        return null;
    }

    public int getId() {
        return id;
    }

    public String getCor() {
        return cor;
    }

    public abstract String getTipo();
}