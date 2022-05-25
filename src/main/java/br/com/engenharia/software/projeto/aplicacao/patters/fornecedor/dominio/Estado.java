package br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.dominio;

public class Estado {
	
	private String descricao;

	public Estado(String descricao) {
		super();
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
