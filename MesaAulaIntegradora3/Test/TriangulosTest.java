//Mesa 04 Mauro Lucio, Juliana Novais, Vanessa Santos e Lucas Nogueira//
class TesteTriangulo {
    public static void main(String[] args) {
        Triangulo triangulo1 = TrianguloFactory.criarTriangulo("Vermelho", 2);
        triangulo1.desenhar();

        Triangulo triangulo2 = TrianguloFactory.criarTriangulo("Vermelho", 1);
        triangulo2.desenhar();

        Triangulo triangulo3 = TrianguloFactory.criarTriangulo("Azul", 3);
        triangulo3.desenhar();

        Triangulo triangulo4 = TrianguloFactory.criarTriangulo("Verde", 2);
        triangulo4.desenhar();
    }
}