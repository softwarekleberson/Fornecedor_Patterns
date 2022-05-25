package br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.negocio.implementacao;

import br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.dominio.EntidadeDominio;
import br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.dominio.TipoEndereco;

public class ValidaTipoEndereco extends AbstractValidador{

	public String processar(EntidadeDominio entidade) {
		
		TipoEndereco endereco = (TipoEndereco)entidade;
		
		if(isNull(endereco.getNome())) {
			sb.append("Invalido Nome");
		}
		
		if(isNull(endereco.getDescricao())) {
			sb.append("invalido Descrição");
		}
		
		if(sb.length() != 0) {
			return sb.toString();
		}
		
		return null;
	}

	
		

}
