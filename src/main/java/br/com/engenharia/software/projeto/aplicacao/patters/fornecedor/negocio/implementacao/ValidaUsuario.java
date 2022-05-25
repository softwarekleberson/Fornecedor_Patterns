package br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.negocio.implementacao;

import br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.dominio.EntidadeDominio;
import br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.dominio.Usuario;

public class ValidaUsuario extends AbstractValidador {

	public String processar(EntidadeDominio entidade) {
		Usuario usuario = (Usuario)entidade;
		
		if(isNull(usuario.getLogin())) {
			sb.append("Invalido Login");
		}
		
		if(isNull(usuario.getSenha())) {
			sb.append("Invalida Senha");
		}
		
		if(sb.length() != 0) {
			return sb.toString();
		}
		
		return null;
	}

}
