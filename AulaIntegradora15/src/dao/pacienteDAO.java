package dao;

import model.Paciente;

import java.util.List;

public interface pacienteDAO {
    void cadastrarPaciente(Paciente paciente);
    void excluirPaciente(Paciente paciente);
    Paciente buscarPacientePorId(int id);
    List<Paciente> buscarTodosPacientes();
}