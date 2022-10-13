package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import Dominio.Usuario;
import config.Conexao;

public class ServicoDAO {
	
	public void salvar(Usuario usuario) {
		String sql = "INSERT INTO usuarios(usuario, senha, perfil) VALUES (?, ?, ?)";
		
		Connection con = null;
		PreparedStatement  pstm = null;
		
		try {
			con = Conexao.criarConexao();
			
			pstm = (PreparedStatement) con.prepareStatement(sql);
			pstm.setString(1, usuario.getUsuario());
			pstm.setString(2, usuario.getSenha());
			pstm.setInt(3, usuario.getPerfil());
			
			pstm.execute();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				System.out.println("Usuario salvo com sucesso!");
				if(pstm!=null) {
					pstm.close();
				}
				
				if(con!=null) {
					con.close();
				}
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
