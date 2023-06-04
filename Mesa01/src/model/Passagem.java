package model;

import java.util.Date;
import java.util.List;

public class Passagem {
    private String origem;
    private String destino;
    private Date dataPartida;
    private Date dataRetorno;

    // Construtor, getters e setters omitidos para brevidade

    @Override
    public String toString() {
        return "Passagem{" +
                "origem='" + origem + '\'' +
                ", destino='" + destino + '\'' +
                ", dataPartida=" + dataPartida +
                ", dataRetorno=" + dataRetorno +
                '}';
    }

    public List<Passagem> buscarPassagens(Date dataIda, Date dataVolta, String cidade) {
    }

    public Object getDestino() {
    }
}