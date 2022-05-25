package br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.negocio.implementacao;

import br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.dominio.EntidadeDominio;
import br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.dominio.TipoLogradouro;

public class ValidaTipoLogradouro extends AbstractValidador{

	public String processar(EntidadeDominio entidade) {
		TipoLogradouro tipoLogradouro = (TipoLogradouro)entidade;
		
		if(isNull(tipoLogradouro.getNome())) {
			sb.append("Invalido Nome");
		}
		
		if(isNull(tipoLogradouro.getDescricao())) {
			sb.append("Invalido Descrição");
		}
		
		if(sb.length() != 0) {
			return sb.toString();
		}
		return null;
	}

}
