package br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.controle;

import java.util.List;

import br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.dominio.EntidadeDominio;

public interface IFachada {
		
	public String salvar(EntidadeDominio entidadeDominio);
	public String alterar(EntidadeDominio entidadeDominio);
	public List<EntidadeDominio>consultar(EntidadeDominio entidadeDominio); 
	public String excluir(EntidadeDominio entidadeDominio);
	public String inativar(EntidadeDominio entidadeDominio);
	public String ativar(EntidadeDominio entidadeDominio);
	public List<EntidadeDominio>listaFornecimento(EntidadeDominio entidadeDominio);
	public String adicionaContatoEmail(EntidadeDominio entidadeDominio);
	public String adicionaContatoTelefone(EntidadeDominio entidadeDominio);
	public String adicionaTelefoneEmail(EntidadeDominio entidadeDominio);
	public String validaCnpj(EntidadeDominio entidadeDominio);
	public String validaListaFornecimento(EntidadeDominio entidadeDominio);
	
}

