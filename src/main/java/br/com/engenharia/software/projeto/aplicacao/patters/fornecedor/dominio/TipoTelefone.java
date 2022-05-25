package br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.dominio;

public class TipoTelefone extends EntidadeDominio{
	
	private String descricao;
	private Telefone telefone;
	
	public TipoTelefone(String descricao, Telefone telefone) {
		super();
		this.descricao = descricao;
		this.telefone = telefone;
	}

	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public Telefone getTelefone() {
		return telefone;
	}
	
	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}
	
	
}
