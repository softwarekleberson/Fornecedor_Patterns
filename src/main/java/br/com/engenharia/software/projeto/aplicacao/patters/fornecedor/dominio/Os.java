package br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.dominio;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Os extends EntidadeDominio{
	
	private LocalDate dataInicio;
	private Fornecedor fornecedor;
	private Empresa empresa;
	private List<Servico>servico = new ArrayList<Servico>();
	
	public Os(LocalDate dataInicio, Fornecedor fornecedor, Empresa empresa) {
		super();
		this.dataInicio = dataInicio;
		this.fornecedor = fornecedor;
		this.empresa = empresa;
	}
	
	public LocalDate getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(LocalDate dataInicio) {
		this.dataInicio = dataInicio;
	}
	public Fornecedor getFornecedor() {
		return fornecedor;
	}
	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}
	public Empresa getEmpresa() {
		return empresa;
	}
	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	public List<Servico> getServico() {
		return servico;
	}
	public void setServico(List<Servico> servico) {
		this.servico = servico;
	}
	
	
	
}
