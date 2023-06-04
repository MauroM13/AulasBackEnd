package main;

import facade.ViagemFacade;
import model.Viagem;

import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ViagemFacade viagemFacade = new ViagemFacade();

        String cidade = "Rio de Janeiro";
        Date dataIda = new Date(123456789);
        Date dataVolta = new Date(987654321);

        List<Viagem> viagens = viagemFacade.buscarViagens(cidade, dataIda, dataVolta);

        System.out.println("Viagens disponíveis para " + cidade + " de " + dataIda + " a " + dataVolta + ":");
        for (Viagem viagem : viagens) {
            System.out.println(viagem);
        }
    }
}