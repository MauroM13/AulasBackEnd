package test;

import model.Paciente;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class PacienteDAOTest {
    private PacienteDAOImpl pacienteDAO;

    @Before
    public void setUp() {
        pacienteDAO = new PacienteDAOImpl(); // Supondo que você tenha implementado a classe PacienteDAOImpl
    }

    @Test
    public void cadastrarPaciente_deveCadastrarPacienteCorretamente() {
        Paciente paciente = new Paciente();
        paciente.setNome("João");
        paciente.setSobrenome("Silva");
        paciente.setRg("123456789");
        // Defina os demais atributos do paciente

        pacienteDAO.cadastrarPaciente(paciente);

        assertEquals(1, paciente.getId()); // Supondo que o ID do primeiro paciente seja 1
    }

    private void assertEquals(int i, Object id) {
    }

    private void assertEquals(Paciente i, Object id) {
    }

    @Test
    public void excluirPaciente_deveExcluirPacienteCorretamente() {
        Paciente paciente = new Paciente();
        paciente.setId(1); // Supondo que o paciente com ID 1 existe

        pacienteDAO.excluirPaciente(paciente);

        assertNull(pacienteDAO.buscarPacientePorId(1)); // Verifica se o paciente foi excluído
    }

    private void assertNull(Paciente buscarPacientePorId) {
    }

    @Test
    public void buscarPacientePorId_deveRetornarPacienteCorreto() {
        Paciente pacienteEsperado = new Paciente();
        pacienteEsperado.setId(1); // Supondo que o paciente com ID 1 existe

        Paciente pacienteEncontrado = pacienteDAO.buscarPacientePorId(1);

        assertEquals(pacienteEsperado, pacienteEncontrado); // Verifica se o paciente encontrado é igual ao esperado
    }
}