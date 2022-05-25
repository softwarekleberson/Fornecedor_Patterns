package br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.negocio.implementacao;


import br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.negocio.IStrategy;

public abstract class AbstractValidador implements IStrategy  {

	protected StringBuilder sb = new StringBuilder();

	protected boolean isNull(Object obj){
		if(obj == null || obj.toString().trim() == "")
			return true;
		return false;
	}
	
}
