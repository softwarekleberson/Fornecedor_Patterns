package br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.negocio.implementacao;

import br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.dominio.EntidadeDominio;
import br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.dominio.Pessoa;

public class ValidaPessoa extends AbstractValidador {

	public String processar(EntidadeDominio entidade) {
		Pessoa pessoa = (Pessoa)entidade;
		
		if(isNull(pessoa.getNome())) {
			sb.append("Invalido Nome");
		}
		
		if(sb.length() != 0) {
			return sb.toString();
		}
		return null;
	}

}
