package service;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import model.Passagem;

public class PassagemService {
    public List<Passagem> buscarPassagens(String origem, String destino, Date dataPartida, Date dataRetorno) {
        // Lógica para buscar passagens de acordo com os parâmetros
        // Aqui, por simplicidade, estamos apenas criando uma lista com uma única passagem
        return Arrays.asList(new Passagem(origem, destino, dataPartida, dataRetorno));
    }
}