package br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.dominio;


public class Contato extends Pessoa {
	
	private String email;
	private Fornecedor fornecedor;
	private Telefone telefone;
	private Departamento departamento;
	
	public Contato(String nome, String email, Telefone telefone, Departamento departamento) {
		super(nome);
		
		setEmail(email);
		
		this.telefone = telefone;
		this.departamento = departamento;
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
	
	public Fornecedor getFornecedor() {
		return fornecedor;
	}
	
	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}
	
	public Telefone getTelefone() {
		return telefone;
	}
	
	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}
	
	public Departamento getDepartamento() {
		return departamento;
	}
	
	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	
	
}
