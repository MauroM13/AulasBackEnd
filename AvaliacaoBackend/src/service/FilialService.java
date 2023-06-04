package service;

import dao.FilialDAO;
import model.Filial;

import java.util.List;

public class FilialService {
    private FilialDAO filialDAO;

    public FilialService(FilialDAO filialDAO) {
        this.filialDAO = filialDAO;
    }

    public void cadastrarFilial(Filial filial) {
        filialDAO.salvar(filial);
        System.out.println("Filial cadastrada com sucesso: " + filial);
    }

    public List<Filial> listarFiliais() {
        return null;
    }
}