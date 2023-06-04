package Funcionario;

import java.time.LocalDate;
import java.time.Period;

public class Funcionario implements Vendedor {
    private String nome;
    private LocalDate dataContratacao;

    public Funcionario(String nome, LocalDate dataContratacao) {
        this.nome = nome;
        this.dataContratacao = dataContratacao;
    }

    public void obterAfiliado(Afiliado afiliado) {
        System.out.println("Funcionário " + this.nome + " obteve o afiliado " + afiliado.getNome());
        afiliado.setIndicador(this);
    }

    public void vender() {
        System.out.println("Funcionário " + this.nome + " realizou uma venda");
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

        System.out.println("Funcionário: " + this.nome + " | Total de pontos: " + pontos + " | Categoria: " + categoria);
    }

    public String getNome() {
        return nome;
    }

    public int calcularPontos() {
        LocalDate dataAtual = LocalDate.now();
        int anosAntiguidade = Period.between(dataContratacao, dataAtual).getYears();

        return (anosAntiguidade * 5) + 5;
    }
}