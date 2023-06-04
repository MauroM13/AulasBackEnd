package facade;

import model.Hotel;
import model.Passagem;
import model.Viagem;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ViagemFacade {

    private Passagem passagem;
    private Hotel hotel;

    public ViagemFacade() {
        this.passagem = new passagem();
        this.hotel = new Hotel();
    }

    public List<Passagem> buscarViagens(String cidade, Date dataIda, Date dataVolta) {
        List<Passagem> viagens = new ArrayList<>();

        List<Passagem> passagens = passagem.buscarPassagens(dataIda, dataVolta, cidade);
        List<Hotel> hoteis = hotel.buscarHotel(dataIda, dataVolta, cidade);

        for (Passagem passagem : passagens) {
            for (Hotel hotel : hoteis) {
                if (passagem.getDestino().equals(hotel.getCidade())) {
                    Viagem viagem = new Viagem(passagem, hotel);
                    viagens.add(viagem);
                }
            }
        }

        return viagens;
    }
}