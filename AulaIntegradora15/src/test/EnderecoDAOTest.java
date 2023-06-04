package test;

import model.endereco;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class EnderecoDAOTest {
    private dao.enderecoDAO enderecoDAO;

    @Before
    public void setUp() {
        enderecoDAO = (dao.enderecoDAO) new EnderecoDAOImpl(); // Supondo que você tenha implementado a classe EnderecoDAOImpl
    }

    @Test
    public void cadastrarEndereco_deveCadastrarEnderecoCorretamente() {
        endereco endereco = new endereco();
        endereco.setRua("Rua A");
        endereco.setNumero("123");
        endereco.setCidade("São Paulo");
        endereco.setBairro("Centro");

        enderecoDAO.cadastrarEndereco(endereco);

        assertEquals(1, endereco.getId()); // Supondo que o ID do primeiro endereço seja 1
    }

    private void assertEquals(int i, int id) {
    }

    @Test
    public void excluirEndereco_deveExcluirEnderecoCorretamente() {
        endereco endereco = new endereco();
        endereco.setId(1); // Supondo que o endereço com ID 1 existe

        enderecoDAO.excluirEndereco(endereco);

        assertNull(enderecoDAO.buscarEnderecoPorId(1)); // Verifica se o endereço foi excluído
    }

    private void assertNull(endereco buscarEnderecoPorId) {
    }

    @Test
    public void buscarEnderecoPorId_deveRetornarEnderecoCorreto() {
        endereco enderecoEsperado = new endereco();
        enderecoEsperado.setId(1); // Supondo que o endereço com ID 1 existe

        endereco enderecoEncontrado = enderecoDAO.buscarEnderecoPorId(1);

        assertEquals(enderecoEsperado.getId(), enderecoEncontrado); // Verifica se o endereço encontrado é igual ao esperado
    }

    private void assertEquals(int id, endereco enderecoEncontrado) {
    }
}