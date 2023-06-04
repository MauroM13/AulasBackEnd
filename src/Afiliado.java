package Afiliado;

public class Afiliado implements Vendedor {
    private String nome;
    private Vendedor indicador;

    public Afiliado(String nome) {
        this.nome = nome;
    }

    public void vender() {
        System.out.println("Afiliado " + this.nome + " realizou uma venda");
    }

    public void mostrarCategoria() {
        int pontos = calcularPontos();
        String categoria;

        if (pontos < 20) {
            categoria = "Novato";
        } else if (pontos < 31) {
            categoria = "Aprendiz";
        } else if (pontos < 41) {
            categoria = "Bom";
        } else {
            categoria = "Mestre";
        }

        System.out.println("Afiliado: " + this.nome + " | Total de pontos: " + pontos + " | Categoria: " + categoria);
    }

    public String getNome() {
        return nome;
    }

    public void setIndicador(Vendedor indicador) {
        this.indicador = indicador;
    }

    public int calcularPontos() {
        return this.indicador.calcularPontos() + 15;
    }
}