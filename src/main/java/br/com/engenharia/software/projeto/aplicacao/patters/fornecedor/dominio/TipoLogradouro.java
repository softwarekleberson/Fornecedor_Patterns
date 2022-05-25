package br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.dominio;

public class TipoLogradouro extends EntidadeDominio{
	
	private String nome;
	private String descricao;
	private Endereco endero;
	
	public TipoLogradouro(String nome, String descricao, Endereco endero) {
		super();
		this.nome = nome;
		this.descricao = descricao;
		this.endero = endero;
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
	
	public Endereco getEndero() {
		return endero;
	}
	
	public void setEndero(Endereco endero) {
		this.endero = endero;
	}
	
	
	
}
