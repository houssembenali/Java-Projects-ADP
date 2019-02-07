package com.adp.utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class ConnectionManager {

	private static final String URL = "jdbc:mysql://localhost:3306/BanqueDB";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "password";
	private static final int MIN_POOL_SIZE = 5;
	private static final int MAX_POOL_SIZE = 10;
	
	private static DataSource dataSource = null;
	
	static {
		try {
			HikariConfig hiKariConfig = new HikariConfig();
			hiKariConfig.setJdbcUrl(URL);
			hiKariConfig.setUsername(USERNAME);
			hiKariConfig.setPassword(PASSWORD);
			
			hiKariConfig.setMinimumIdle(MIN_POOL_SIZE);
			hiKariConfig.setMaximumPoolSize(MAX_POOL_SIZE);

			dataSource = new HikariDataSource(hiKariConfig);
			
		} catch (Exception e) {
			System.out.println("LOG : Il y a eu l'exception : "+e);
		}
	}
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		// Chargement du Driver
		Class.forName("com.mysql.jdbc.Driver");

		// Connexion sur la BDD
		Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		return connection;
	}
	
	public static DataSource getDataSource() throws ClassNotFoundException, SQLException {
		// Chargement du Driver
		return dataSource;
	}
	

}
