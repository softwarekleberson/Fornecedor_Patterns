package br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.dao;

import java.util.List;

import br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.dominio.EntidadeDominio;

public interface IDAO {

	public void salvar(EntidadeDominio entidadeDominio);
	public void alterar(EntidadeDominio entidadeDominio);
	public List<EntidadeDominio> consultar (EntidadeDominio entidadeDominio);
	public void excluir(EntidadeDominio entidadeDominio);
	public void inativar(EntidadeDominio entidadeDominio);
	public void ativar(EntidadeDominio entidadeDominio);
	public List<EntidadeDominio>listaFornecimento(EntidadeDominio entidadeDominio);
	public void adicionaContatoEmail(EntidadeDominio entidadeDominio);
	public void adicionaContatoTelefone(EntidadeDominio entidadeDominio);
	public void adicionaTelefoneEmal(EntidadeDominio entidadeDominio);
	public void validaCnpj(EntidadeDominio entidadeDominio);
	public void validaListaFornecimento(EntidadeDominio entidadeDominio);
}
