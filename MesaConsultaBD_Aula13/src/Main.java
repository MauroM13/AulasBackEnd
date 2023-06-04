import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
    public Main() throws SQLException {
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");

    }

    Connection connection = DriverManager.getConnection("jdbc:h2:~/seu_banco_de_dados", "usuario", "senha");

    String createTableQuery = "CREATE TABLE IF NOT EXISTS Dentista (" +
            "Sobrenome VARCHAR(255), " +
            "Nome VARCHAR(255), " +
            "Matricula VARCHAR(255)" +
            ")";
    PreparedStatement createTableStatement = connection.prepareStatement(createTableQuery);{
        createTableStatement.execute();
    }
}

}

        String insertQuery = "INSERT INTO Dentista (Sobrenome, Nome, Matricula) VALUES (?, ?, ?)";
        PreparedStatement insertStatement = connection.prepareStatement(insertQuery);
        insertStatement.setString(1, "Sobrenome1");
        insertStatement.setString(2, "Nome1");
        insertStatement.setString(3, "Matricula1");
        insertStatement.executeUpdate();

        String updateQuery = "UPDATE Dentista SET Matricula = ? WHERE Sobrenome = ? AND Nome = ?";
        PreparedStatement updateStatement = connection.prepareStatement(updateQuery);
        updateStatement.setString(1, "NovaMatricula");
        updateStatement.setString(2, "Sobrenome1");
        updateStatement.setString(3, "Nome1");
        updateStatement.executeUpdate();

        String selectQuery = "SELECT * FROM Dentista";
        PreparedStatement selectStatement = connection.prepareStatement(selectQuery);
        ResultSet resultSet = selectStatement.executeQuery();

        while (resultSet.next()){
        String sobrenome=resultSet.getString("Sobrenome");
        String nome=resultSet.getString("Nome");
        String matricula=resultSet.getString("Matricula");
        System.out.println("Sobrenome: "+sobrenome+", Nome: "+nome+", Matrícula: "+matricula);
        }

}