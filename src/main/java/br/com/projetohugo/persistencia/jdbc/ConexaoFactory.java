package br.com.projetohugo.persistencia.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoFactory {

	public static Connection getConnection() {

		try {
			return DriverManager.getConnection("jdbc:postgresql://localhost:5432/projetoweb", "postgres", "root");
		} catch (SQLException e) {
			//relanšando a exception
			throw new RuntimeException(e);
		}
		
	}

}
