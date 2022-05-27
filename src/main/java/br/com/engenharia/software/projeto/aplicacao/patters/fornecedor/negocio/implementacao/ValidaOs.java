package br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.negocio.implementacao;

import java.time.LocalDate;

import br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.dominio.EntidadeDominio;
import br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.dominio.Os;
import br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.negocio.IStrategy;

public class ValidaOs implements IStrategy {

	public String processar(EntidadeDominio entidade) {
		LocalDate dia = LocalDate.now();
		
		Os os = (Os)entidade;
		os.setData(dia);
	
		return null;
	}

}
