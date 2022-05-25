package br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.negocio.implementacao;

import br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.dominio.Cidade;
import br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.dominio.EntidadeDominio;

public class ValidaCidade extends AbstractValidador{

	public String processar(EntidadeDominio entidade) {
		Cidade cidade = (Cidade)entidade;
		
		if(isNull(cidade.getDescricao())) {
			sb.append("Invalido Descrição");
		}
		
		if(sb.length() != 0) {
			return sb.toString();
		}
		return null;
	}

}
