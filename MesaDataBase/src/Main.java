import model.Figura;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Main {

    private static final String sqlCreateTable = "DROP TABLE IF EXISTS Figuras; CREATE TABLE Figuras"
            + "("
            + " Id INT PRIMARY KEY,"
            + " Nome VARCHAR(100) NOT NULL,"
            + " Tipo VARCHAR(100) NOT NULL,"
            + " Cor VARCHAR(100) NOT NULL"
            + ")";

    private static final String sqlInsert1 = "INSERT INTO Figuras (Id, Nome, Tipo, Cor) VALUES (1, 'Circulo Azul', 'Circulo', 'Azul')";
    private static final String sqlInsert2 = "INSERT INTO Figuras (Id, Nome, Tipo, Cor) VALUES (2, 'Circulo Vermelho', 'Circulo', 'Vermelho')";
    private static final String sqlInsert3 = "INSERT INTO Figuras (Id, Nome, Tipo, Cor) VALUES (3, 'Quadrado Amarelo', 'Quadrado', 'Amarelo')";
    private static final String sqlInsert4 = "INSERT INTO Figuras (Id, Nome, Tipo, Cor) VALUES (4, 'Quadrado Branco', 'Quadrado', 'Branco')";
    private static final String sqlInsert5 = "INSERT INTO Figuras (Id, Nome, Tipo, Cor) VALUES (5, 'Quadrado Verde', 'Quadrado', 'Verde')";
    private static Connection DriverManager;

    public static void main(String[] args) {
        try {
            Connection connection = getConexao();
            Statement statement = connection.createStatement();

            statement.execute(sqlCreateTable);
            statement.execute(sqlInsert1);
            statement.execute(sqlInsert2);
            statement.execute(sqlInsert3);
            statement.execute(sqlInsert4);
            statement.execute(sqlInsert5);

            // Consulta à tabela Figuras
            String sqlQuery = "SELECT * FROM Figuras WHERE Cor = 'Vermelho'";
            ResultSet resultSet = statement.executeQuery(sqlQuery);

            // Lista para armazenar as figuras vermelhas
            List<Figura> figurasVermelhas = new ArrayList<>();

            // Iterar sobre os resultados e criar objetos Figura
            while (resultSet.next()) {
                int id = resultSet.getInt("Id");
                String nome = resultSet.getString("Nome");
                String tipo = resultSet.getString("Tipo");
                String cor = resultSet.getString("Cor");

                // Criar objeto Figura e adicionar à lista
                Figura figura = new Figura(id, nome, tipo, cor) {
                    @Override
                    public String getTipo() {
                        return null;
                    }
                };
                figurasVermelhas.add(figura);
            }

            // Exibir as figuras vermelhas na tela
            for (Figura figura : figurasVermelhas) {
                System.out.println("ID: " + figura.getId());
                System.out.println("Tipo: " + figura.getTipo());
                System.out.println("Cor: " + figura.getCor());
                System.out.println();
            }

            connection.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static Connection getConexao() throws Exception {
        Class.forName("org.h2.Driver");
        return DriverManager;
    }
}
