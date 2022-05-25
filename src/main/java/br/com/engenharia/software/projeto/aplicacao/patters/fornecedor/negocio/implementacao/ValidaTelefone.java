package br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.negocio.implementacao;

import br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.dominio.EntidadeDominio;
import br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.dominio.Telefone;

public class ValidaTelefone extends AbstractValidador {

	public String processar(EntidadeDominio entidade) {
		Telefone telefone = (Telefone)entidade;
		
		if(isNull(telefone.getDdd())) {
			sb.append("Invalido DDD");
		}
		
		if(isNull(telefone.getDdi())) {
			sb.append("Invalido DDI");
		}
		
		if(isNull(telefone.getNumero())) {
			sb.append("Invalido Numero");
		}
		
		if(sb.length() != 0) {
			return sb.toString();
		}
		
		return null;
	}

}
