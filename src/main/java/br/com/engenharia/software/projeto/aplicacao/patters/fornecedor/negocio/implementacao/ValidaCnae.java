package br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.negocio.implementacao;

import br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.dominio.CNAE;
import br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.dominio.EntidadeDominio;
import br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.negocio.IStrategy;

public class ValidaCnae implements IStrategy {

	public String processar(EntidadeDominio entidade) {
		CNAE cnae = (CNAE)entidade;
		
		if(cnae.getNumero().trim().length() != 7) {
			return "Cnae invalido";
		}
		return null;
	}

}
