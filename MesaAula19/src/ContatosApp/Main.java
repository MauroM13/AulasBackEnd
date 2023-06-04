package ContatosApp;

import model.ContatosManager;
import model.Contato;

import java.util.ArrayList;
import java.util.List;

class MainApp {
    public static void main(String[] args) {
        // Caminho do arquivo para salvar e recuperar os contatos
        String arquivo = "ContatosApp/contatos.dat";

        // Criação da lista de contatos
        List<Contato> contatos = new ArrayList<>();
        contatos.add(new Contato("João", "joao@example.com", "1234567890"));
        contatos.add(new Contato("Maria", "maria@example.com", "0987654321"));

        // Salva os contatos no arquivo
        ContatosManager.salvarContatos(contatos, arquivo);
        System.out.println("Contatos salvos com sucesso!");

        // Recupera os contatos do arquivo
        List<Contato> contatosRecuperados = ContatosManager.recuperarContatos(arquivo);

        // Exibe a lista de contatos recuperados no console
        System.out.println("Lista de contatos recuperados:");
        for (Contato contato : contatosRecuperados) {
            System.out.println(contato);
        }
    }
}