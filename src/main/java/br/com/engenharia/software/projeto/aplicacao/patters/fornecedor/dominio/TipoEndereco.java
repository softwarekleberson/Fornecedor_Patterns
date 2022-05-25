package br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.dominio;

public class TipoEndereco extends EntidadeDominio {
	
	private String nome;
	private String descricao;
	private Endereco endereco;
	 
	public TipoEndereco(String nome, String descricao, Endereco endereco) {
		super();
		this.nome = nome;
		this.descricao = descricao;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
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
	
	
}
