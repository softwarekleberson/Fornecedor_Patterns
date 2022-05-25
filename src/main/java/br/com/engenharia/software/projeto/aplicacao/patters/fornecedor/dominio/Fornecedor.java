package br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.dominio;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Fornecedor extends ObrigacoesFornecedor {
	
	private boolean isRascunho;
	private String email;
	private String cnpj;
	private String inscricaoEstadual;
	private String inscricaoMunicipal;
	private LocalDate dataCadastro;
	private String razaoSocial;
	private String nomeFantasia;
	
	private List<Empresa>empresa = new ArrayList<Empresa>();
	private Endereco endereco;
	private List<CNAE>cnae = new ArrayList<CNAE>();
	private List<Contato>contato = new ArrayList<Contato>();
	private List<Telefone>telefone = new ArrayList<Telefone>();
	private List<Produto>produto = new ArrayList<Produto>();
	private List<Servico>servico = new ArrayList<Servico>();
	private List<Os>os = new ArrayList<Os>();
	private Status status;
	private List<TipoFornecimento>tipoFornecimentos = new ArrayList<TipoFornecimento>();
	
	public Fornecedor(LocalDate prazoMaximoEntrega, LocalDate prazoMinimoEntrega, String email, String cnpj, LocalDate dataCadastro,
			String inscricaoEstadual, String inscricaoMunicipal, String razaoSocial,
			String nomeFantasia, Endereco endereco, List<CNAE> cnae, List<Telefone> telefone,
			List<TipoFornecimento> tipoFornecimentos) {
		super(prazoMaximoEntrega, prazoMinimoEntrega);
		
		setEmail(email);
		setCnpj(cnpj);
		setInscricaoEstadual(inscricaoEstadual);
		setInscricaoMunicipal(inscricaoMunicipal);
		
		this.dataCadastro = dataCadastro;
		this.razaoSocial = razaoSocial;
		this.nomeFantasia = nomeFantasia;
		this.endereco = endereco;
		this.cnae = cnae;
		this.telefone = telefone;
		this.tipoFornecimentos = tipoFornecimentos;
	}
	
	public void registroFornecimento() {
		//implementar Tipo Fornecimento
	}
	
	public void contatoTelefone(String ddd, String ddi, String numero) {
		this.telefone.add(new Telefone(ddd, ddi, numero));
	}
	
	public void contatoEmail(String nome, String email, Telefone telefone, Departamento departamento) {
		this.contato.add(new Contato(nome, email, telefone, departamento));
	}
	
	public void contatoEmailETelefone(String ddd, String ddi, String numero, String nome, String email, Telefone telefone, Departamento departamento ) {
		this.telefone.add(new Telefone(ddd, ddi, numero));
		this.contato.add(new Contato(nome, email, telefone, departamento));
	}

	public boolean isRascunho() {
		return isRascunho;
	}

	public void setRascunho(boolean isRascunho) {
		this.isRascunho = isRascunho;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		if(email == null || !email.matches("^[a-zA-Z0-9._]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {
			throw new IllegalArgumentException("Email invalido");
		}
		this.email = email;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		if(cnpj == null || !cnpj.matches("\\d{2}\\.\\d{3}\\.\\d{3}\\/\\d{4}\\-\\d{2}")) {
			throw new IllegalArgumentException("Cnpj invalido");
		}
		this.cnpj = cnpj;
	}

	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}

	public void setInscricaoEstadual(String inscricaoEstadual) {
		if(inscricaoEstadual == null || !inscricaoEstadual.matches("\\d{2}\\-\\d{6}\\-\\d{1}")) {
			throw new IllegalArgumentException("Inscricão Estadual Invalida");
		}
		this.inscricaoEstadual = inscricaoEstadual;
	}

	public String getInscricaoMunicipal() {
		return inscricaoMunicipal;
	}

	public void setInscricaoMunicipal(String inscricaoMunicipal) {
		if(inscricaoMunicipal == null || !inscricaoMunicipal.matches("\\d{6}\\-\\d{3}\\-\\d{2}")) {
			throw new IllegalArgumentException("Inscrição Municipal Invalida");
		}
		this.inscricaoMunicipal = inscricaoMunicipal;
	}

	public LocalDate getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(LocalDate dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public List<Empresa> getEmpresa() {
		return empresa;
	}

	public void setEmpresa(List<Empresa> empresa) {
		this.empresa = empresa;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public List<CNAE> getCnae() {
		return cnae;
	}

	public void setCnae(List<CNAE> cnae) {
		this.cnae = cnae;
	}

	public List<Contato> getContato() {
		return contato;
	}

	public void setContato(List<Contato> contato) {
		this.contato = contato;
	}

	public List<Telefone> getTelefone() {
		return telefone;
	}

	public void setTelefone(List<Telefone> telefone) {
		this.telefone = telefone;
	}

	public List<Produto> getProduto() {
		return produto;
	}

	public void setProduto(List<Produto> produto) {
		this.produto = produto;
	}

	public List<Servico> getServico() {
		return servico;
	}

	public void setServico(List<Servico> servico) {
		this.servico = servico;
	}

	public List<Os> getOs() {
		return os;
	}

	public void setOs(List<Os> os) {
		this.os = os;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public List<TipoFornecimento> getTipoFornecimentos() {
		return tipoFornecimentos;
	}

	public void setTipoFornecimentos(List<TipoFornecimento> tipoFornecimentos) {
		this.tipoFornecimentos = tipoFornecimentos;
	}

}
