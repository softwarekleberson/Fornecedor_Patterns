package br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.dominio;

public class Cidade extends EntidadeDominio {
	
	private String descricao;
	private Endereco endereco;
	private Uf uf;
	
	public Cidade(String descricao, Endereco endereco, Uf uf) {
		super();
		this.descricao = descricao;
		this.endereco = endereco;
		this.uf = uf;
	}

	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public Endereco getEndereco() {
		return endereco;
	}
	
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public Uf getUf() {
		return uf;
	}
	
	public void setUf(Uf uf) {
		this.uf = uf;
	}
	
	
}
