package Dominio;

import javax.xml.crypto.Data;

public class Faturas {
	private int id;
	private int matriculas_codigo;
	private Data vencimento;
	private float valor;
	private Data pagamento;
	private Data cancelamento;
	private String observacao;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMatriculas_codigo() {
		return matriculas_codigo;
	}
	public void setMatriculas_codigo(int matriculas_codigo) {
		this.matriculas_codigo = matriculas_codigo;
	}
	public Data getVencimento() {
		return vencimento;
	}
	public void setVencimento(Data vencimento) {
		this.vencimento = vencimento;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public Data getPagamento() {
		return pagamento;
	}
	public void setPagamento(Data pagamento) {
		this.pagamento = pagamento;
	}
	public Data getCancelamento() {
		return cancelamento;
	}
	public void setCancelamento(Data cancelamento) {
		this.cancelamento = cancelamento;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	
}
