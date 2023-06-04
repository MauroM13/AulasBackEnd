package model;


public class Quadrado extends Figura {
    public Quadrado(int id, String cor) {
        super(id, nome, tipo, cor);
    }

    @Override
    public String getTipo() {
        return "Quadrado";
    }
}