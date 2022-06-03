package br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.controle.web;

import br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.dominio.EntidadeDominio;

public interface IViewHelper {

	public EntidadeDominio getEntidade(HttpServletRequest request);
	public void setEntidade(HttpServletResponse response, HttpServletRequest request,
			Object msg);
	
}
