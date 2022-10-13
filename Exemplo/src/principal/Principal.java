package principal;

import java.sql.Connection;

import Dominio.Usuario;

//import java.sql.SQLException;

import config.*;

import dao.UsuarioDAO;

public class Principal {
		public static void main(String[] args) throws Exception {
			Connection con = Conexao.criarConexao();
			
			if((con != null)) {
				System.out.println("Conexão obtida com sucesso");;
				con.close();
			}		
			
			//CriarTabelas tabelas = new CriarTabelas();
			//tabelas.criarTabela();
			
			UsuarioDAO usuarioDao = new UsuarioDAO();
			
			Usuario usuario = new Usuario();
			usuario.setUsuario("Segundo user");
			usuario.setSenha("EWRTSadsda");
			usuario.setPerfil(2);
			
			//usuarioDao.salvar(usuario);
			
			//Atualizar o contato
			Usuario c1 = new Usuario();
			c1.setUsuario("Terceiro user");
			c1.setSenha("123456");
			c1.setPerfil(1);
			c1.setId(3);
			
			//usuarioDao.atualizar(c1);
			
			//Visualização dos registros do banco de dados 
			for(Usuario u : usuarioDao.getUsuarios()) {
				System.out.println("Usuario:" +u.getUsuario());
			}
			
			//Deletar
			
			//usuarioDao.excluirPorId(4);			
			
			//Backup
			//Backup.BackupDb("C:\\Users\\Public\\Teste\\backup.backup");
			Backup.fazBackup("C:\\Program Files\\PostgreSQL\\14\\bin\\pg_dump.exe", "C:\\Users\\Public\\Teste\\");
		}
}
