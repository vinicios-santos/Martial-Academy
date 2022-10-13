package Dominio;

public class Usuario {

	private int id;
	private String usuario;
	private String senha;
	private int perfil;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public int getPerfil() {
		return perfil;
	}
	public void setPerfil(int perfil) {
		this.perfil = perfil;
	}	
}





/*
 * 		//private static final String criarUsuarios = "CREATE TABLE usuarios "
	//		+ "(ID INT PRIMARY KEY, "
		//	+ "USUARIO VARCHAR(60), "
			//+ "SENHA VARCHAR(60), "
			//+ "PERFIL(9))";
	
*/
