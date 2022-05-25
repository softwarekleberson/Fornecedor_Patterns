package br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.dominio;


public class Ramal extends Telefone{
	
	private String codigo;
	private String descricao;
	
	public Ramal(String ddd, String ddi, String numero, String codigo, String descricao) {
		super(ddd, ddi, numero);
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public String getCodigo() {
		return codigo;
	}
	
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	

}
