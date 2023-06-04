package model;

public class Viagem {
    private Passagem passagem;
    private Hotel hotel;

    // Construtor, getters e setters omitidos para brevidade

    @Override
    public String toString() {
        return "Viagem{" +
                "passagem=" + passagem +
                ", hotel=" + hotel +
                '}';
    }
}