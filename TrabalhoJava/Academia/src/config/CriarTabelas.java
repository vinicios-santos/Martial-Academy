package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

public class CriarTabelas {
	
	private static final String criarUsuarios = "CREATE TABLE IF NOT EXISTS usuarios (ID SERIAL PRIMARY KEY, USUARIO VARCHAR(60), SENHA VARCHAR(60), PERFIL INT)";
	
	private static final String criarAlunos = "CREATE TABLE IF NOT EXISTS alunos (CODIGO_ALUNO SERIAL PRIMARY KEY, ALUNO VARCHAR(60), DATA_NASCIMENTO TIMESTAMP, SEXO CHAR(1), TELEFONE VARCHAR(60), CELULAR VARCHAR(60), EMAIL VARCHAR(60), OBSERVACAO VARCHAR(60), ENDERECO  VARCHAR(60), CIDADE VARCHAR(60), ESTADO CHAR(2), PAIS VARCHAR(60), NUMERO VARCHAR(60), COMPLEMENTO VARCHAR(60), BAIRRO VARCHAR(60), CEP VARCHAR(60))";
	
	private static final String criarAssiduidade = "CREATE TABLE IF NOT EXISTS assiduidade (CODIGO_MATRICULA INT NOT NULL, DATA_ENTRADA TIMESTAMP NOT NULL DEFAULT localtimestamp)";
	
	private static final String criarCidades = "CREATE TABLE IF NOT EXISTS cidades (ID SERIAL PRIMARY KEY, CIDADE VARCHAR(60) NOT NULL, ESTADO CHAR(2) NOT NULL, PAIS VARCHAR(60) NOT NULL)";
	
	private static final String criarFaturas = "CREATE TABLE IF NOT EXISTS faturas (ID SERIAL PRIMARY KEY, CODIGO_MATRICULA INT NOT NULL, DATA_VENCIMENTO TIMESTAMP NOT NULL, VALOR FLOAT(5) NOT NULL, DATA_PAGAMENTO TIMESTAMP, DATA_CANCELAMENTO TIMESTAMP)";
	
	private static final String criarGraduacoes = "CREATE TABLE IF NOT EXISTS graduacoes (ID SERIAL PRIMARY KEY, GRADUACAO VARCHAR(60), MODALIDADE VARCHAR(60))";
        
        private static final String criarFaturasMatriculas = "CREATE TABLE IF NOT EXISTS faturas_matriculas (ID SERIAL PRIMARY KEY, CODIGO_MATRICULA INT NOT NULL, DATA_VENCIMENTO DATE NOT NULL, VALOR FLOAT(5) NOT NULL, DATA_PAGAMENTO TIMESTAMP, DATA_CANCELAMENTO DATE)";
	
	private static final String criarMatriculas = "CREATE TABLE IF NOT EXISTS matriculas (CODIGO_MATRICULA SERIAL PRIMARY KEY, codigo_aluno INT NOT NULL, DATA_MATRICULA TIMESTAMP, DIA_VENCIMENTO TIMESTAMP, DATA_ENCERRAMENTO TIMESTAMP)";
	
	private static final String criarModalidades = "CREATE TABLE IF NOT EXISTS modalidades (ID SERIAL PRIMARY KEY, MODALIDADE VARCHAR(60))";
	
	private static final String criarMatriculasModalidades = "CREATE TABLE IF NOT EXISTS matriculas_modalidades (CODIGO_MATRICULA INT NOT NULL, MODALIDADES VARCHAR(60) NOT NULL, GRADUACAO VARCHAR(60), PLANO VARCHAR(60), DATA_INICIO DATE, DATA_FIM DATE)";
	
	private static final String criarPlanos = "CREATE TABLE IF NOT EXISTS planos (ID SERIAL PRIMARY KEY, DESCRICAO VARCHAR(60), MODALIDADE VARCHAR(60), PLANO VARCHAR(60) NOT NULL)";
	
	
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
                                        statement.execute(criarFaturasMatriculas);
			
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
