package br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.negocio.implementacao;

import br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.dominio.EntidadeDominio;
import br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.dominio.TipoEmpresa;
import br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.negocio.IStrategy;

public class ValidaTipoEmpresa implements IStrategy{

	public String processar(EntidadeDominio entidade) {
		TipoEmpresa tipoEmpresa = (TipoEmpresa)entidade;
		
		if(tipoEmpresa.getId() != 1) {
			return "Tipo empresa deve ser escolhida";
		}
		
		return null;
	}

}
