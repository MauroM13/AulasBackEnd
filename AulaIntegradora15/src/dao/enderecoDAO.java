package dao;

import model.endereco;

public interface enderecoDAO {
    void cadastrarEndereco(endereco endereco);
    void excluirEndereco(endereco endereco);
    endereco buscarEnderecoPorId(int id);
}