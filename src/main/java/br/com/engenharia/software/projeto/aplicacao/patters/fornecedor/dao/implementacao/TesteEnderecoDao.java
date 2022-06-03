package br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.dao.implementacao;

import br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.dao.IDAO;
import br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.dominio.Cidade;
import br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.dominio.Endereco;

public class TesteEnderecoDao {
	public static void main(String[] args) {
		
		
		Endereco endereco = new Endereco("08725-320", "Rua bARCELONA", "4", "vila dO MESSI", null, null, null, null, null, null);
		Cidade cidade = new Cidade("Sao jose", null, null);
		
		IDAO daoEnd = new EnderecoDao();
		IDAO daoCidade = new EnderecoDao();
		
		daoEnd.salvar(endereco);
		daoCidade.salvar(cidade);

		
	} 
}
