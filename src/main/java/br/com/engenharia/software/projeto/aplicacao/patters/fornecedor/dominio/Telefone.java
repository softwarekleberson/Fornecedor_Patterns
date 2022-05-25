package br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.dominio;


public class Telefone extends EntidadeDominio {
	
	private String ddd;
	private String numero;
	private String ddi;
	private Fornecedor fornecedor;
	private TipoTelefone telefone;
	private Contato contato;
	
	public Telefone(String ddd, String ddi, String numero) {
		super();
		
		//regec
		setDdd(ddd);
		setNumero(numero);
		setDdi(ddi);
	}

	public String getDdd() {
		return ddd;
	}
	
	public void setDdd(String ddd) {
		if(ddd == null || !ddd.matches("\\d{2}")) {
			throw new IllegalArgumentException("DDD invalido");
		}
		this.ddd = ddd;
	}
	
	public String getNumero() {
		return numero;
	}
	
	public void setNumero(String numero) {
		if(numero == null || !numero.matches("\\d{8} |\\d{9}")) {
			throw new IllegalArgumentException("Numero de telefone invalido");
		}
		this.numero = numero;
	}
	
	public String getDdi() {
		return ddi;
	}
	public void setDdi(String ddi) {
		if(ddi == null || !ddi.matches("\\d{1} |\\d{2} |\\d{3}")) {
			throw new IllegalArgumentException("ddi inavlido");
		}
		this.ddi = ddi;
	}
	
	public Fornecedor getFornecedor() {
		return fornecedor;
	}
	
	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}
	
	public TipoTelefone getTelefone() {
		return telefone;
	}
	
	public void setTelefone(TipoTelefone telefone) {
		this.telefone = telefone;
	}
	
	public Contato getContato() {
		return contato;
	}
	
	public void setContato(Contato contato) {
		this.contato = contato;
	}
	
	

}
