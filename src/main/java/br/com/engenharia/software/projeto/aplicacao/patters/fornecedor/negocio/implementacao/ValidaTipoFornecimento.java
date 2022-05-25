package br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.negocio.implementacao;

import br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.dominio.EntidadeDominio;
import br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.dominio.TipoFornecimento;
import br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.negocio.IStrategy;

public class ValidaTipoFornecimento implements IStrategy {

	public String processar(EntidadeDominio entidade) {
		
		TipoFornecimento tipoFornecimento = (TipoFornecimento)entidade;
		
		if(tipoFornecimento.getId() != 1) {
			return "Tipo de fornecimento deve ser escolhido";
		}
		return null;
	}

}
