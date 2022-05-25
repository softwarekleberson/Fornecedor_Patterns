package br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.dominio;
public class Status extends EntidadeDominio{
	
	public static final String ATIVO = "ATIVO";
	public static final String RASCUNHO ="INATIVO";
	public static final String INATIVO = "INATIVO";
	private Fornecedor fornecedor;
	
	public Status(Fornecedor fornecedor) {
		super();
		this.fornecedor = fornecedor;
	}
	
	public Fornecedor getFornecedor() {
		return fornecedor;
	}
	
	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}
	
	public String getATIVO() {
		return ATIVO;
	}
	
	public String getRASCUNHO() {
		return RASCUNHO;
	}
	
	public String getINATIVO() {
		return INATIVO;
	}
	
	
}
