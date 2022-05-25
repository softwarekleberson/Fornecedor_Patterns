package br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.negocio;

import br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.dominio.EntidadeDominio;

public interface IStrategy {
	
	public String processar(EntidadeDominio entidade);
		
}
