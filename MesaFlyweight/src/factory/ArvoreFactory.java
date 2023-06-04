package factory;

import model.ArvoreCompartilhada;

import java.util.HashMap;
import java.util.Map;

public class ArvoreFactory {
    private Map<String, ArvoreCompartilhada> arvoresCompartilhadas;

    public ArvoreFactory() {
        arvoresCompartilhadas = new HashMap<>();
    }

    public ArvoreCompartilhada getArvoreCompartilhada(int altura, int largura, String cor) {
        String chave = altura + "-" + largura + "-" + cor;

        if (!arvoresCompartilhadas.containsKey(chave)) {
            ArvoreCompartilhada arvore = new ArvoreCompartilhada(altura, largura, cor);
            arvoresCompartilhadas.put(chave, arvore);
        }

        return arvoresCompartilhadas.get(chave);
    }
}