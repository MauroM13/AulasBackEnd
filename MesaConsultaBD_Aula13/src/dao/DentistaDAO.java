package dao;

import Dentista.Dentista;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class DentistaDAO {
    private Connection connection;

    public DentistaDAO(Connection connection) {
        this.connection = connection;
    }

    public void create(Dentista dentista) throws SQLException {
        String insertQuery = "INSERT INTO Dentista (Sobrenome, Nome, Matricula) VALUES (?, ?, ?)";
        try (PreparedStatement insertStatement = connection.prepareStatement(insertQuery)) {
            insertStatement.setString(1, dentista.getSobrenome());
            insertStatement.setString(2, dentista.getNome());
            insertStatement.setString(3, dentista.getMatricula());
            insertStatement.executeUpdate();
        }
    }

    public List<Dentista> readAll() throws SQLException {
        List<Dentista> dentistas = new ArrayList<>();
        String selectQuery = "SELECT * FROM Dentista";
        try (PreparedStatement selectStatement = connection.prepareStatement(selectQuery);
             ResultSet resultSet = selectStatement.executeQuery()) {
            while (resultSet.next()) {
                String sobrenome = resultSet.getString("Sobrenome");
                String nome = resultSet.getString("Nome");
                String matricula = resultSet.getString("Matricula");
                Dentista dentista = new Dentista(sobrenome, nome, matricula);
                dentistas.add(dentista);
            }
        }
        return dentistas;
    }

    public void update(Dentista dentista) throws SQLException {
        String updateQuery = "UPDATE Dentista SET Matricula = ? WHERE Sobrenome = ? AND Nome = ?";
        try (PreparedStatement updateStatement = connection.prepareStatement(updateQuery)) {
            updateStatement.setString(1, dentista.getMatricula());
            updateStatement.setString(2, dentista.getSobrenome());
            updateStatement.setString(3, dentista.getNome());
            updateStatement.executeUpdate();
        }
    }

    public void delete(Dentista dentista) throws SQLException {
        String deleteQuery = "DELETE FROM Dentista WHERE Sobrenome = ? AND Nome = ?";
        try (PreparedStatement deleteStatement = connection.prepareStatement(deleteQuery)) {
            deleteStatement.setString(1, dentista.getSobrenome());
            deleteStatement.setString(2, dentista.getNome());
            deleteStatement.executeUpdate();
        }
    }
}