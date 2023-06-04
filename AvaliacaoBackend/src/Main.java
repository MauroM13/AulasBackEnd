import dao.FilialDAO;
import dao.FilialDAOImpl;
import model.Filial;
import service.FilialService;

public class Main {
    public static void main(String[] args) {
        FilialDAO filialDAO = new FilialDAOImpl();
        FilialService filialService = new FilialService(filialDAO);

        // Inserir 5 filiais
        for (int i = 1; i <= 5; i++) {
            Filial filial = new Filial();
            filial.setId(i);
            filial.setNome("Filial " + i);
            filial.setRua("Rua " + i);
            filial.setNumero(Integer.toString(i));
            filial.setCidade("Cidade " + i);
            filial.setEstado("Estado " + i);
            filial.setEstrelas(i == 5); // Apenas a última filial é 5 estrelas

            filialService.cadastrarFilial(filial);
        }
    }
}