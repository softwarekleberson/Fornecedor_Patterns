package br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.dominio;
import java.time.LocalDate;

public class ObrigacoesFornecedor extends EntidadeDominio {
	
	protected LocalDate prazoMaximoEntrega;
	protected LocalDate prazoMinimoEntrega;
	protected LocalDate diaPrevistoEntrega;
	protected LocalDate horarioPrevistoEntrega;
	
	public ObrigacoesFornecedor(LocalDate prazoMaximoEntrega, LocalDate prazoMinimoEntrega) {
		
		this.prazoMaximoEntrega = prazoMaximoEntrega;
		this.prazoMinimoEntrega = prazoMinimoEntrega;
	}

	public LocalDate getPrazoMaximoEntrega() {
		return prazoMaximoEntrega;
	}

	public void setPrazoMaximoEntrega(LocalDate prazoMaximoEntrega) {
		this.prazoMaximoEntrega = prazoMaximoEntrega;
	}

	public LocalDate getPrazoMinimoEntrega() {
		return prazoMinimoEntrega;
	}

	public void setPrazoMinimoEntrega(LocalDate prazoMinimoEntrega) {
		this.prazoMinimoEntrega = prazoMinimoEntrega;
	}

	public LocalDate getDiaPrevistoEntrega() {
		return diaPrevistoEntrega;
	}

	public void setDiaPrevistoEntrega(LocalDate diaPrevistoEntrega) {
		this.diaPrevistoEntrega = diaPrevistoEntrega;
	}

	public LocalDate getHorarioPrevistoEntrega() {
		return horarioPrevistoEntrega;
	}

	public void setHorarioPrevistoEntrega(LocalDate horarioPrevistoEntrega) {
		this.horarioPrevistoEntrega = horarioPrevistoEntrega;
	}
	
	
	
}
