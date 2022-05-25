package br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.negocio.implementacao;

import br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.dominio.EntidadeDominio;
import br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.dominio.Uf;

public class ValidaUf extends AbstractValidador {

	public String processar(EntidadeDominio entidade) {
		Uf uf = (Uf)entidade;
		
		if(isNull(uf.getDescricao())) {
			sb.append("Invalido Descrição");
		}
		
		if(isNull(uf.getSigla())) {
			sb.append("Invalido Sigla");
		}
		
		if(sb.length() != 0) {
			return sb.toString();
		}
		
		
		return null;
	}

}
