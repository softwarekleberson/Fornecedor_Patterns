package br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.dao.implementacao;

import java.sql.Connection;
import java.sql.SQLException;

public class TesteConexao {
	public static void main(String[] args) {
		
		Conexao cx = new Conexao();
		
		try {
			Connection connection = cx.getConnectionPostgres();
			
			if(connection != null){
				System.out.println("Conectou");
			}else{
				System.out.println("Não conectou");
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
