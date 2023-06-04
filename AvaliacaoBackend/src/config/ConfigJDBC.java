package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLDataException;
import java.sql.SQLException;

public class ConfigJDBC {


private String jdbcDrive;
private String  dbUrl;
private String nomeUsuario;

private String senha;

    public ConfigJDBC() {
        this.jdbcDrive = "org.com.Driver";
        this.dbUrl = "jdbc:h2:~/filial";
        this.nomeUsuario = "sa";
        this.senha = "";

    }

public Connection conectarComBancoDeDados() throws SQLException {
        Connection connection = null;

        try {
            connection = DriverManager.getConnection(dbUrl, nomeUsuario, senha);
        } catch (SQLDataException e){
            e.printStackTrace();
        }

        return connection;
}}


