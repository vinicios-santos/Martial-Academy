package config;

import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.SQLWarning;
import java.sql.Statement;


public class Conexao {
	
	private static final String url = "jdbc:postgresql://localhost:5432/postgres";;
	private static final String usuario = "postgres";
	private static final String senha = "postgres";
	//private Connection con;
	
	public Conexao(){
		//url = "jdbc:postgresql://localhost:5432/postgres";
		//usuario = "postgres";
		//senha = "postgres";
		
		try {
			
			Class.forName("org.postgresql.Driver");
			//con = DriverManager.getConnection(url,usuario,senha);
			DriverManager.getConnection(url,usuario,senha);
			System.out.println("Conexão realizada com sucesso");
		} catch (Exception e) {
			System.out.println("Conexão com erro");
			e.printStackTrace();
		} 
	}
	
	public static Connection criarConexao() throws Exception {
		Class.forName("org.postgresql.Driver");
		Connection connection = DriverManager.getConnection(url,usuario,senha);
		
		return connection;
	}
}
