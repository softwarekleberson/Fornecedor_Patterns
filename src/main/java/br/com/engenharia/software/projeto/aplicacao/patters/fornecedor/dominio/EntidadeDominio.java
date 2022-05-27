package br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.dominio;

import java.sql.Date;
import java.time.LocalDate;

public class EntidadeDominio {

	protected int id;
	protected LocalDate data;
	
	public EntidadeDominio() {
		this.id += 1;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public LocalDate getData() {
		return data;
	}
	
	public void setData(LocalDate data) {
		this.data = data;
	}
}
