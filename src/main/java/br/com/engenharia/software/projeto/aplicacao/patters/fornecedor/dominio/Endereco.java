package br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.dominio;

public class Endereco extends EntidadeDominio {
	
	private String cep;
	private String logradouro;
	private String numero;
	private String bairro;
	private String complemento;
	
	private Fornecedor fornecedor;
	private Cidade cidade;
	private Estado estado;
	private Pais pais;
	private TipoLogradouro tipoLogradouro;
	private TipoEndereco tipoEndereco;
	
	public Endereco(String cep, String logradouro, String numero, String bairro, Fornecedor fornecedor, Cidade cidade,
			Estado estado, Pais pais, TipoLogradouro tipoLogradouro, TipoEndereco tipoEndereco) {
		super();
		
		setCep(cep);
		
		//strategy
		this.logradouro = logradouro;
		this.numero = numero;
		this.bairro = bairro;
		this.fornecedor = fornecedor;
		this.cidade = cidade;
		this.estado = estado;
		this.pais = pais;
		this.tipoLogradouro = tipoLogradouro;
		this.tipoEndereco = tipoEndereco;
	}

	public String getCep() {
		return cep;
	}
	
	public void setCep(String cep) {
		if(cep == null || !cep.matches("\\d{5}-\\d{3}")) {
			throw new IllegalArgumentException("Cep invalido");
		}
		this.cep = cep;
	}
	
	public String getLogradouro() {
		return logradouro;
	}
	
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	
	public String getNumero() {
		return numero;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getBairro() {
		return bairro;
	}
	
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	public String getComplemento() {
		return complemento;
	}
	
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	
	public Fornecedor getFornecedor() {
		return fornecedor;
	}
	
	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}
	
	public Cidade getCidade() {
		return cidade;
	}
	
	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
	
	public TipoLogradouro getTipoLogradouro() {
		return tipoLogradouro;
	}
	
	public void setTipoLogradouro(TipoLogradouro tipoLogradouro) {
		this.tipoLogradouro = tipoLogradouro;
	}
	
	public TipoEndereco getTipoEndereco() {
		return tipoEndereco;
	}
	
	public void setTipoEndereco(TipoEndereco tipoEndereco) {
		this.tipoEndereco = tipoEndereco;
	}
	
	public Estado getEstado() {
		return estado;
	}
	
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
	public Pais getPais() {
		return pais;
	}
	
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	
	
}
