package br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.negocio.implementacao;

import br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.dominio.Departamento;
import br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.dominio.EntidadeDominio;

public class ValidaDepartamento extends AbstractValidador{

	public String processar(EntidadeDominio entidade) {
		Departamento departamento = (Departamento)entidade;
		
		if(isNull(departamento.getDescricao())) {
			sb.append("Invalido Departamento");
		}
		
		if(sb.length() != 0) {
			return sb.toString();
		}
		
		return null;
	}

}
