package br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.negocio.implementacao;

import br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.dominio.Contato;
import br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.dominio.EntidadeDominio;

public class ValidaContato extends AbstractValidador{

	public String processar(EntidadeDominio entidade) {
		Contato contato = (Contato)entidade;
		
		if(isNull(contato.getEmail())) {
			sb.append("Invalido Email");
		}
		
		if(sb.length() != 0) {
			return sb.toString();
		}
		
		return null;
	}

	

}
