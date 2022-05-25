package br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.dominio;

public class Departamento extends EntidadeDominio{
	
	private String descricao;
	private Contato contato;
	
	public Departamento(String descricao, Contato contato) {
		super();
		this.descricao = descricao;
		this.contato = contato;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public Contato getContato() {
		return contato;
	}
	
	public void setContato(Contato contato) {
		this.contato = contato;
	}
	
	
}
