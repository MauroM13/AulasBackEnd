import java.util.HashMap;
import java.util.Map;

class TrianguloFactory {
    private static Map<String, Triangulo> cache = new HashMap<>();

    public static Triangulo criarTriangulo(String cor, int tamanho) {
        String chave = cor + tamanho;
        Triangulo triangulo = cache.get(chave);

        if (triangulo == null) {
            triangulo = new Triangulo(cor, tamanho);
            cache.put(chave, triangulo);
        }

        return triangulo;
    }
}