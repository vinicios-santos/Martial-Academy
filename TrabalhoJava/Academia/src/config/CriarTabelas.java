package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

public class CriarTabelas {
	
	private static final String criarUsuarios = "CREATE TABLE usuarios (ID SERIAL PRIMARY KEY, USUARIO VARCHAR(60), SENHA VARCHAR(60), PERFIL INT)";
	
	private static final String criarAlunos = "CREATE TABLE alunos (ID SERIAL PRIMARY KEY, NOME VARCHAR(60), DATA_NACIMENTO TIMESTAMP, SEXO INT, TELEFONE INT, CELULAR INT, EMAIL VARCHAR(60), OBSERVACAO VARCHAR(60), LOGRADOURO VARCHAR(60), CIDADE_CODIGO INT, NUMERO INT, COMPLEMENTO VARCHAR(60), BAIRRO VARCHAR(60), CEP INT)";
	
	private static final String criarAssiduidade = "CREATE TABLE assiduidade (MATRICULAS_CODIGO INT, DATA_ENTRADA TIMESTAMP)";
	
	private static final String criarCidades = "CREATE TABLE cidades (ID SERIAL PRIMARY KEY, CIDADE VARCHAR(60), ESTADO VARCHAR(60), PAIS VARCHAR(60))";
	
	private static final String criarFaturas = "CREATE TABLE faturas (ID SERIAL PRIMARY KEY, MATRICULAS_CODIGO INT, VENCIMENTO TIMESTAMP, VALOR FLOAT(5), PAGAMENTO TIMESTAMP, CANCELAMENTO TIMESTAMP, OBSERVACAO VARCHAR(60))";
	
	private static final String criarGraduacoes = "CREATE TABLE graduacoes (ID SERIAL PRIMARY KEY, DESCRICAO VARCHAR(60), MODALIDADES_CODIGO INT)";
	
	private static final String criarMatriculas = "CREATE TABLE matriculas (ID SERIAL PRIMARY KEY, ALUNOS_CODIGO INT, DATA_MATRICULA TIMESTAMP, DATA_VENCIMENTO TIMESTAMP, DATA_ENCERRAMENTO TIMESTAMP)";
	
	private static final String criarModalidades = "CREATE TABLE modalidades (ID SERIAL PRIMARY KEY, DESCRICAO VARCHAR(60))";
	
	private static final String criarMatriculasModalidades = "CREATE TABLE matriculas_modalidades (MATRICULAS_CODIGO INT, MODALIDADES_CODIGO INT, GRADUACOES_CODIGO INT, PLANOS_CODIGO INT)";
	
	private static final String criarPlanos = "CREATE TABLE planos (ID SERIAL PRIMARY KEY, DESCRICAO VARCHAR(60), MODALIDADES_CODIGO INT, VALOR_MENSAL FLOAT(5), OBSERVACAO VARCHAR(60))";
	
	
	private String url = "jdbc:postgresql://localhost:5432/postgres";
	private String usuario = "postgres";
	private String senha = "admin";	
	
	public void criarTabela() throws SQLException { //colocar que esse void aceita alguma coisa de acordo com a tabela sendo criada? ou só criar todas com um for? tipo popular banco?
		
		System.out.println("Criando tabelas");
		//try (Conexao con = new Conexao();
		try (Connection con = DriverManager.getConnection(url, usuario, senha);
				Statement statement = con.createStatement();){	
					statement.execute(criarUsuarios);
					statement.execute(criarAlunos);
					statement.execute(criarAssiduidade);
					statement.execute(criarCidades);
					statement.execute(criarFaturas);
					statement.execute(criarGraduacoes);
					statement.execute(criarMatriculas);
					statement.execute(criarModalidades);
					statement.execute(criarMatriculasModalidades);
					statement.execute(criarPlanos);
			
		} catch (SQLException e) {
			printSQLException(e);
		} finally {
			System.out.println("Tabelas criadas com sucesso!");
		}
		
	}

	
	public static void printSQLException(SQLException ex) {
        for (Throwable e: ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }
}
