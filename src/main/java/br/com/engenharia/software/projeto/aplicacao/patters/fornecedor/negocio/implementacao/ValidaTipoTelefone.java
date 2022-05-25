package br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.negocio.implementacao;

import br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.dominio.EntidadeDominio;
import br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.dominio.TipoTelefone;

public class ValidaTipoTelefone extends AbstractValidador {

	public String processar(EntidadeDominio entidade) {
		
		TipoTelefone telefone = (TipoTelefone)entidade;
		
		if(isNull(telefone.getDescricao())) {
			sb.append("Invalido Descricao");
		}
		
		if(sb.length() != 0) {
			return sb.toString();
		}
		
		return null;
	}

}
