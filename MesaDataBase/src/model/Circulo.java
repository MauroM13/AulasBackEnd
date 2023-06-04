package model;



public class Circulo extends Figura {
    public Circulo(int id, String cor) {
        super(id, nome, tipo, cor);
    }

    @Override
    public String getTipo() {
        return "Círculo";
    }
}