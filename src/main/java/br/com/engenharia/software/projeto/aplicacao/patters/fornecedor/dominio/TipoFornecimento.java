package br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.dominio;

public class TipoFornecimento extends EntidadeDominio{

	public static final String VENDA = "VENDA";
	public static final String SERVICO = "SERVICO";
	private Fornecedor fornecedor;
	
	public TipoFornecimento() {
		super();
	}

	public static String getVenda() {
		return VENDA;
	}

	public static String getServico() {
		return SERVICO;
	}
	
	public Fornecedor getFornecedor() {
		return fornecedor;
	}
	
	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}
	
}
