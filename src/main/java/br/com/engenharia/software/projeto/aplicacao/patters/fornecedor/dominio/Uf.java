package br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.dominio;
import java.util.ArrayList;
import java.util.List;

public class Uf extends EntidadeDominio {
	
	private String descricao;
	private String sigla;
	private List<Cidade>cidade = new ArrayList<Cidade>();
	private Pais pais;
	
	public Uf(String descricao, String sigla, Pais pais) {
		super();
		this.descricao = descricao;
		this.sigla = sigla;
		this.pais = pais;
	}

	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getSigla() {
		return sigla;
	}
	
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	
	public List<Cidade> getCidade() {
		return cidade;
	}
	
	public void setCidade(List<Cidade> cidade) {
		this.cidade = cidade;
	}
	
	public Pais getPais() {
		return pais;
	}
	
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	
	

}
