package br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.controle.web;

import br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.dominio.EntidadeDominio;

public interface ICommand {

	 Object executar(EntidadeDominio entidade); 
	
}
