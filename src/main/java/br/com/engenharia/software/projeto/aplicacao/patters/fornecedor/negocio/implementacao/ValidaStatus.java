package br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.negocio.implementacao;

import br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.dominio.EntidadeDominio;
import br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.dominio.Status;
import br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.negocio.IStrategy;

public class ValidaStatus implements IStrategy{

	public String processar(EntidadeDominio entidade) {
		Status status = (Status)entidade;
		
		if(status.getId() != 1) {
			return "Status deve ser escolhido";
		}
		
		return null;
	}

}
