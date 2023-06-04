package model;

import java.util.Date;
import java.util.List;

public class Hotel {
    private String cidade;
    private Date dataEntrada;
    private Date dataSaida;

    // Construtor, getters e setters omitidos para brevidade

    @Override
    public String toString() {
        return "Hotel{" +
                "cidade='" + cidade + '\'' +
                ", dataEntrada=" + dataEntrada +
                ", dataSaida=" + dataSaida +
                '}';
    }

    public List<Hotel> buscarHotel(Date dataIda, Date dataVolta, String cidade) {
    }

    public Object getCidade() {
    }
}