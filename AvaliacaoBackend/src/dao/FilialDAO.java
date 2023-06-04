package dao;

import model.Filial;

import java.util.List;

public interface FilialDAO {
    void salvar(Filial filial);

    List<Filial> listar();

}