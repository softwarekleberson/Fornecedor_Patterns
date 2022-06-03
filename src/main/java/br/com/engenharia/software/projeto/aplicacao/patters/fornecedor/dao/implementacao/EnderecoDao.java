package br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.dao.implementacao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.dao.IDAO;
import br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.dominio.Cidade;
import br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.dominio.Endereco;
import br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.dominio.EntidadeDominio;

public class EnderecoDao implements IDAO {
	
	private Connection connection = null;
	
	public void salvar(EntidadeDominio entidadeDominio){
		
		PreparedStatement pst = null;
		Endereco endereco = (Endereco) entidadeDominio;


		try {
			connection = Conexao.getConnectionPostgres();

			connection.setAutoCommit(false);


			StringBuilder sql = new StringBuilder();
			sql.append("INSERT INTO Endereco(cep, logradouro, numero, bairro, complemento) VALUES (?,?,?,?,?) ");

			pst = connection.prepareStatement(sql.toString(),
					Statement.RETURN_GENERATED_KEYS);

			pst.setString(1, endereco.getCep());
			pst.setString(2, endereco.getLogradouro());
			pst.setString(3, endereco.getNumero());
			pst.setString(4, endereco.getBairro());
			pst.setString(5, endereco.getComplemento());
				
			pst.executeUpdate();

			ResultSet rs = pst.getGeneratedKeys();
			int idCli = 0;
			if (rs.next())
				idCli = rs.getInt(1);
			endereco.setId(idCli);

			salvarCidade(endereco);
			salvarLogradouro(endereco);
			salvarPais(endereco);
			salvarUf(endereco);
			salvarTipoEndereco(endereco);
			
			connection.commit();
		} catch (Exception e) {
			try {
				connection.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}

			e.printStackTrace();
		} finally {
			try {
				pst.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
			
		System.out.println("foi");
	}
	
	private void salvarTipoEndereco(Endereco endereco) {
		// TODO Auto-generated method stub
		
	}

	private void salvarUf(Endereco endereco) {
		// TODO Auto-generated method stub
		
	}

	private void salvarPais(Endereco endereco) {
		// TODO Auto-generated method stub
		
	}

	private void salvarLogradouro(Endereco endereco) {
		// TODO Auto-generated method stub
		
	}

	private void salvarCidade(Endereco endereco)throws SQLException, ClassNotFoundException {
			 
	}

	public void alterar(EntidadeDominio entidadeDominio) {
		// TODO Auto-generated method stub

	}

	public List<EntidadeDominio> consultar(EntidadeDominio entidadeDominio) {
		// TODO Auto-generated method stub
		return null;
	}

	public void excluir(EntidadeDominio entidadeDominio) {
		// TODO Auto-generated method stub

	}

	public void inativar(EntidadeDominio entidadeDominio) {
		// TODO Auto-generated method stub

	}

	public void ativar(EntidadeDominio entidadeDominio) {
		// TODO Auto-generated method stub

	}

	public List<EntidadeDominio> listaFornecimento(EntidadeDominio entidadeDominio) {
		// TODO Auto-generated method stub
		return null;
	}

	public void adicionaContatoEmail(EntidadeDominio entidadeDominio) {
		// TODO Auto-generated method stub

	}

	public void adicionaContatoTelefone(EntidadeDominio entidadeDominio) {
		// TODO Auto-generated method stub

	}

	public void adicionaTelefoneEmal(EntidadeDominio entidadeDominio) {
		// TODO Auto-generated method stub

	}

	public void validaCnpj(EntidadeDominio entidadeDominio) {
		// TODO Auto-generated method stub

	}

	public void validaListaFornecimento(EntidadeDominio entidadeDominio) {
		// TODO Auto-generated method stub

	}

}
