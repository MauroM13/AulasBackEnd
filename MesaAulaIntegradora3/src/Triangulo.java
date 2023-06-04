import java.util.HashMap;
import java.util.Map;

// Classe Flyweight que representa o Triângulo
class Triangulo {
    private String cor;
    private int tamanho;

    public Triangulo(String cor, int tamanho) {
        this.cor = cor;
        this.tamanho = tamanho;
    }

    public void desenhar() {
        System.out.println("Triângulo " + cor + " de tamanho " + tamanho);
    }
}

