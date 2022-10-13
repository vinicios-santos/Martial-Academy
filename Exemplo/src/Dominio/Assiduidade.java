package Dominio;

import javax.xml.crypto.Data;

public class Assiduidade {
	private int matriculas_codigo;
	private Data data_entrada;
	
	public int getMatriculas_codigo() {
		return matriculas_codigo;
	}
	public void setMatriculas_codigo(int matriculas_codigo) {
		this.matriculas_codigo = matriculas_codigo;
	}
	public Data getData_entrada() {
		return data_entrada;
	}
	public void setData_entrada(Data data_entrada) {
		this.data_entrada = data_entrada;
	}
}
