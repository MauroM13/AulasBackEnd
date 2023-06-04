import model.Floresta;

// Mauro Lucio Marques, Pablo Haleson, Lucas Nogueira, Anderson Bamberg//
public class Main {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();

        Floresta floresta = new Floresta();

        for (int i = 0; i < 500000; i++) {
            floresta.plantarArvore(200, 400, "verde"); // Ornamentais
            floresta.plantarArvore(500, 300, "vermelho"); // Frutíferas
        }

        System.out.println("Memória utilizada: " + (runtime.totalMemory() - runtime.freeMemory()));

    }

}