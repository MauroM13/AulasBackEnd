package dao;

import model.Filial;

import java.util.ArrayList;
import java.util.List;

public class FilialDAOImpl implements FilialDAO {
    private List<Filial> filiais;

    public FilialDAOImpl() {
        filiais = new ArrayList<>();
    }

    @Override
    public void salvar(Filial filial) {
        filiais.add(filial);
    }


    @Override
    public List<Filial> listar() {
        return filiais;
    }
}