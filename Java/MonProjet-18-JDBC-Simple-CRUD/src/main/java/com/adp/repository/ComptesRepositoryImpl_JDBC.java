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
import com.adp.utilities.ConnectionManager;

public class ComptesRepositoryImpl_JDBC  implements IComptesRepository{

	private DataSource dataSource ;
	
	public ComptesRepositoryImpl_JDBC() {
	  try {
		dataSource = ConnectionManager.getDataSource();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
	@Override
	public void create(Compte c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Compte findById(String id) {
		// TODO Auto-generated method stub
		return null;
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
