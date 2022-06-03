package br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.controle.web;

import br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.dominio.EntidadeDominio;

public class ConsultarCommand extends AbstracCommad {

	public Object executar(EntidadeDominio entidade) {
		return fachada.consultar(entidade);
	}

}
