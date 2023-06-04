package service;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import model.Hotel;

public class HotelService {
    public List<Hotel> buscarHoteis(String cidade, Date dataEntrada, Date dataSaida) {
        // Lógica para buscar hotéis de acordo com os parâmetros
        // Aqui, por simplicidade, estamos apenas criando uma lista com um único hotel
        return Arrays.asList(new Hotel(cidade, dataEntrada, dataSaida));
    }
}