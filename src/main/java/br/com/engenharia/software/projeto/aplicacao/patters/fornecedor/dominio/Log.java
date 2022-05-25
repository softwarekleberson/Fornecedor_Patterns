package br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.dominio;
import java.time.LocalDate;

public class Log {
	
	private LocalDate datahora;
	
	public Log(LocalDate datahora) {
		super();
		this.datahora = datahora;
	}

	public LocalDate getDatahora() {
		return datahora;
	}

	public void setDatahora(LocalDate datahora) {
		this.datahora = datahora;
	}

	public void registrarTransacao(Usuario usuario, Fornecedor fornecedor) {
		
	}
}
