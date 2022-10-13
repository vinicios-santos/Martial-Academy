package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Dominio.Usuario;
import config.Conexao;

public class MatriculaDAO {
	
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

	
	public List<Usuario> getUsuarios(){
		
		String sql = "SELECT * FROM usuarios";
		
		List<Usuario> usuarios = new ArrayList<Usuario>();
		
		Connection con = null;
		PreparedStatement pstm = null;
		//Classe que vai recuperar os dados do banco
		ResultSet rset = null;
		
		try {
			con = Conexao.criarConexao();
			
			pstm = (PreparedStatement) con.prepareStatement(sql);
			
			rset = pstm.executeQuery();
			
			while (rset.next()) {
				
				Usuario usuario = new Usuario();
				
				usuario.setId(rset.getInt("id"));
				usuario.setUsuario(rset.getString("usuario"));
				usuario.setPerfil(rset.getInt("perfil"));
				
				usuarios.add(usuario);
			} 
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rset!=null) {
					rset.close();
				}
				
				if(pstm!=null) {
					pstm.close();
				}
				
				if(con!=null) {
					con.close();
				}
			}catch (Exception e){
				e.printStackTrace();
			}
		}	
		return usuarios;
	}
	
	public void atualizar(Usuario usuario) {
		
		String sql = "UPDATE usuarios SET usuario = ?, senha = ?, perfil = ? WHERE id = ?";
		
		Connection con = null;
		PreparedStatement  pstm = null;
		
		try {
			con = Conexao.criarConexao();
			
			pstm = (PreparedStatement) con.prepareStatement(sql);
			pstm.setString(1, usuario.getUsuario());
			pstm.setString(2, usuario.getSenha());
			pstm.setInt(3, usuario.getPerfil());
			
			pstm.setInt(4, usuario.getId());
			
			pstm.execute();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
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
	
	public void excluirPorId(int id) {
		String sql = "DELETE FROM usuarios WHERE id = ?";

		Connection con = null;
		PreparedStatement  pstm = null;
		
		try {
			con = Conexao.criarConexao();
			
			pstm = (PreparedStatement) con.prepareStatement(sql);
						
			pstm.setInt(1, id);
			
			pstm.execute();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
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
