package br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.negocio.implementacao;

import br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.dominio.EntidadeDominio;
import br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.dominio.Fornecedor;

public class ValidaFornecedor extends AbstractValidador {

	public String processar(EntidadeDominio entidade) {
		Fornecedor fornecedor = (Fornecedor)entidade;
		
		if(isNull(fornecedor.getEmail())) {
			sb.append("Invalido Email");
		}
		
		if(isNull(fornecedor.getCnpj())) {
			sb.append("Invalido Cnpj");
		}
		
		if(isNull(fornecedor.getInscricaoEstadual())) {
			sb.append("Invalido Inscrição Estadual");
		}
		
		if (isNull(fornecedor.getInscricaoMunicipal())) {
			sb.append("Invalido Inscrição Municipal");
		}
		
		if(isNull(fornecedor.getRazaoSocial())) {
			sb.append("Invalido Razão Social");
		}
		
		if(isNull(fornecedor.getNomeFantasia())) {
			sb.append("Invalido Nome Fantasia");
		}
		
		if(sb.length() != 0) {
			return sb.toString();
		}
		return null;
	}

}
