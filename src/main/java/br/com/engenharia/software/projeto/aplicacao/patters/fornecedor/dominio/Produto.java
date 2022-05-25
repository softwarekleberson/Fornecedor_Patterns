package br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.dominio;
public class Produto extends EntidadeDominio {
	
	private int id;
	private String nome;
	private String descricao;
	private Fornecedor fornecedor;
	
	public Produto(int id, String nome, String descricao, Fornecedor fornecedor) {
		super();
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.fornecedor = fornecedor;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
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
	
	public Fornecedor getFornecedor() {
		return fornecedor;
	}
	
	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}
	
	
}
