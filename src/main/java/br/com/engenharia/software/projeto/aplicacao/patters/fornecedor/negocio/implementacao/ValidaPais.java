package br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.negocio.implementacao;

import br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.dominio.EntidadeDominio;
import br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.dominio.Pais;

public class ValidaPais extends AbstractValidador {

	public String processar(EntidadeDominio entidade) {
		Pais pais = (Pais)entidade;
		
		if(isNull(pais.getDescricao())) {
			sb.append("Invalido Descrição");
		}
		
		if(sb.length() != 0) {
			return sb.toString();
		}
		
		
		return null;
	}

}
