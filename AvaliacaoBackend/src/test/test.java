package test;

import dao.FilialDAO;
import dao.FilialDAOImpl;
import model.Filial;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import service.FilialService;


class FilialServiceTest {
    private FilialDAO filialDAO;
    private FilialService filialService;

    @BeforeEach
    public void setUp() {
        filialDAO = new FilialDAOImpl();
        filialService = new FilialService(filialDAO);
    }

    @Test
    public void testCadastrarFiliais() {
        for (int i = 1; i <= 5; i++) {
            Filial filial = new Filial();
            filial.setId(i);
            filial.setNome("Filial " + i);
            filial.setRua("Rua " + i);
            filial.setNumero(Integer.toString(i));
            filial.setCidade("Cidade " + i);
            filial.setEstado("Estado " + i);
            filial.setEstrelas(i == 5);

            filialService.cadastrarFilial(filial);
        }

        Assertions.assertEquals(5, filialDAO.listar().size());
    }
}