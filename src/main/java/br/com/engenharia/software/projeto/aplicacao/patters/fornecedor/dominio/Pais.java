package br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.dominio;
import java.util.ArrayList;
import java.util.List;

public class Pais extends EntidadeDominio {
	
	private String descricao;
	private List<Uf>uf = new ArrayList<Uf>();
	
	public Pais(String descricao, List<Uf> uf) {
		super();
		this.descricao = descricao;
		this.uf = uf;
	}

	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public List<Uf> getUf() {
		return uf;
	}
	
	public void setUf(List<Uf> uf) {
		this.uf = uf;
	}
	
	
}
