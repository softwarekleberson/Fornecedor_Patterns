package br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.negocio.implementacao;

import br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.dominio.EntidadeDominio;
import br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.dominio.Produto;

public class ValidaProduto extends AbstractValidador{

	public String processar(EntidadeDominio entidade) {
		Produto produto = (Produto)entidade;
		
		if(isNull(produto.getNome())) {
			sb.append("Invalido nome");
		}
		
		if(isNull(produto.getDescricao())) {
			sb.append("Invalido Descrição");
		}
		
		if(sb.length() != 0) {
			return sb.toString();
		}
		return null;
	}

}
