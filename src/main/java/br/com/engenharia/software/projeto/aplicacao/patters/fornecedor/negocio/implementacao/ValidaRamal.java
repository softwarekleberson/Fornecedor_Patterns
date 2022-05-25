package br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.negocio.implementacao;

import br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.dominio.EntidadeDominio;
import br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.dominio.Ramal;

public class ValidaRamal extends AbstractValidador {

	public String processar(EntidadeDominio entidade) {
		Ramal ramal = (Ramal)entidade;
		
		if(isNull(ramal.getCodigo())) {
			sb.append("Invalido Codigo");
		}
		
		if(isNull(ramal.getDescricao())) {
			sb.append("Invalido Descrição");
		}
		
		if(sb.length() != 0) {
			return sb.toString();
		}
		
		return null;
	}

}
