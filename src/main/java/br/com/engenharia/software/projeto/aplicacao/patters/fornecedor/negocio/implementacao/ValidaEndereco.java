package br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.negocio.implementacao;

import br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.dominio.Endereco;
import br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.dominio.EntidadeDominio;

public class ValidaEndereco extends AbstractValidador {

	public String processar(EntidadeDominio entidade) {
		Endereco endereco = (Endereco)entidade;
		
		if(isNull(endereco.getCep())) {
			sb.append("Invalido Cep");
		}
		
		if(isNull(endereco.getLogradouro())) {
			sb.append("Invalido Logradouro");
		}
		
		if(isNull(endereco.getNumero())) {
			sb.append("Invalido Numero");
		}
		
		if(isNull(endereco.getBairro())) {
			sb.append("Invalido bairro");
		}
		
		if(isNull(endereco.getComplemento())) {
			sb.append("Invalido Complemento");
		}
		
		if(sb.length() != 0) {
			return sb.toString();
		}
		return null;
	}

}
