package Dominio;

public class Planos {
	private int id;
	private String descricao;
	private int modalidades_codigo;
	private float valor_mensal;
	private String observacao;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getModalidades_codigo() {
		return modalidades_codigo;
	}
	public void setModalidades_codigo(int modalidades_codigo) {
		this.modalidades_codigo = modalidades_codigo;
	}
	public float getValor_mensal() {
		return valor_mensal;
	}
	public void setValor_mensal(float valor_mensal) {
		this.valor_mensal = valor_mensal;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	
	
}
