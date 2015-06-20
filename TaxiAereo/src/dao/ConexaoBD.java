/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author Edu3500
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBD {

//	private static final String URL_POSTGRES	= "jdbc:postgresql://localhost:5432/TaxiAereo";
	private static final String URL_POSTGRES	= "jdbc:postgresql://localhost:5432/Taxi_Aereo";
	private static final String DRIVER_CLASS	= "org.postgresql.Driver";
	private static final String USER			= "postgres";
	private static final String PASS			= "root";
//	private static final String PASS			= "ccet";

	public static Connection getConnection() {
		
		try 
		{
			Class.forName(DRIVER_CLASS);
			return DriverManager.getConnection(URL_POSTGRES, USER, PASS);
			
		} catch (SQLException e)
		{
			System.out.println("Não foi possível estabelecer uma conexão com o banco de dados - erro de SQL");
			System.out.println(e.getMessage());
		} catch (ClassNotFoundException e)
		{
			System.out.println("Não foi possível estabelecer uma conexão com o banco de dados - driver não encontrado");
			System.out.println(e.getMessage());
		} catch (ExceptionInInitializerError e)
		{
			System.out.println("Não foi possível estabelecer uma conexão com o banco de dados - falha na inicialização do banco");
			System.out.println(e.getMessage());
		}
		return null;
	}
}

