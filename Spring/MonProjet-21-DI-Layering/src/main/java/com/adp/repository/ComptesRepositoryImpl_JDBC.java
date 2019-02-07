package com.adp.repository;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.adp.entities.Compte;

public class ComptesRepositoryImpl_JDBC  implements IComptesRepository{

	
	private DataSource dataSource  ;   // Injecté par Spring
	
	
	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	public void create(Compte c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Compte findById(String id) {
		Compte resultat = null;
		try {
			Connection connection = dataSource.getConnection();

			// Formulation d'un statement
			try (Statement statement = connection.createStatement()) {

				// Mise à feu
				String sql = "SELECT * FROM COMPTES WHERE numero= '"+ id+ "'";
				try (ResultSet resultSet = statement.executeQuery(sql)) {

					// Exploitation des résultats
					while (resultSet.next()) {
						String num = resultSet.getString("Numero");
						String prop = resultSet.getString("Proprietaire");
						BigDecimal solde = resultSet.getBigDecimal("Solde");
						resultat = new Compte(num, prop, solde);	
					}

					// Clean up
				} // resultSet.close();
			} // statement.close()
			connection.close();

		} catch (SQLException e) {
			System.out.println("LOG : Attention, il y a eu l'exception : " + e);
		}
		return resultat;
	}

	@Override
	public List<Compte> findAll() {
		List<Compte> resultat = new ArrayList<>();
		try {
			Connection connection = dataSource.getConnection();

			// Formulation d'un statement
			try (Statement statement = connection.createStatement()) {

				// Mise à feu
				String sql = "SELECT * FROM COMPTES ";
				try (ResultSet resultSet = statement.executeQuery(sql)) {

					// Exploitation des résultats
					while (resultSet.next()) {
						String num = resultSet.getString("Numero");
						String prop = resultSet.getString("Proprietaire");
						BigDecimal solde = resultSet.getBigDecimal("Solde");
					    resultat.add(new Compte(num, prop, solde));	
					}

					// Clean up
				} // resultSet.close();
			} // statement.close()
			connection.close();

		} catch (SQLException e) {
			System.out.println("LOG : Attention, il y a eu l'exception : " + e);
		}
		return resultat;
	}


	@Override
	public void update(Compte c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Compte c) {
		// TODO Auto-generated method stub
		
	}

}
