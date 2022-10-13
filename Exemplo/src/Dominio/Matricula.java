package Dominio;

import javax.xml.crypto.Data;

public class Matricula {
	private int id;
	private int alunos_codigo;
	private Data data_matricula;
	private Data data_vencimento;
	private Data data_encerramento;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAlunos_codigo() {
		return alunos_codigo;
	}
	public void setAlunos_codigo(int alunos_codigo) {
		this.alunos_codigo = alunos_codigo;
	}
	public Data getDataMatricula() {
		return data_matricula;
	}
	public void setDataMatricula(Data dataMatricula) {
		this.data_matricula = dataMatricula;
	}
	public Data getDataVencimento() {
		return data_vencimento;
	}
	public void setDataVencimento(Data dataVencimento) {
		this.data_vencimento = dataVencimento;
	}
	public Data getDataEncerramento() {
		return data_encerramento;
	}
	public void setDataEncerramento(Data dataEncerramento) {
		this.data_encerramento = dataEncerramento;
	}
	
}
