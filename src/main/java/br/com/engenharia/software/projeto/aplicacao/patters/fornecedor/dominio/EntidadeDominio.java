package br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.dominio;

import java.sql.Date;

public class EntidadeDominio {

	protected int id;
	protected Date data;
	
	public EntidadeDominio() {
		this.id += 1;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public Date getData() {
		return data;
	}
	
	public void setData(Date data) {
		this.data = data;
	}
}
