package br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.negocio.implementacao;

import br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.dominio.EntidadeDominio;
import br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.dominio.Servico;

public class ValidaServico extends AbstractValidador{

	public String processar(EntidadeDominio entidade) {
		Servico servico = (Servico)entidade;
		
		if(isNull(servico.getDescricao())) {
			sb.append("invalido Descrição");
		}
		
		if(sb.length() != 0) {
			return sb.toString();
		}
		return null;
	}

}
