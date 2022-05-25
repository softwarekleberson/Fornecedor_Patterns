package br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.dominio;

public class CNAE extends EntidadeDominio {
	
	private String numero;
	private Fornecedor fornecedor;
	
	public CNAE(String numero, Fornecedor fornecedor) {
		super();
		
		this.numero = numero;
		this.fornecedor = fornecedor;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public Fornecedor getFornecedor() {
		return fornecedor;
	}
	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}
	
	
}
