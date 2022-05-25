package br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.dominio;
import java.util.ArrayList;
import java.util.List;

public class Pessoa extends EntidadeDominio {
	
	private String nome;
	private List<Usuario>usuario = new ArrayList<Usuario>();
	
	public Pessoa(String nome) {
		super();
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public List<Usuario> getUsuario() {
		return usuario;
	}
	
	public void setUsuario(List<Usuario> usuario) {
		this.usuario = usuario;
	}
	
	
}
