package br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.dominio;
import java.util.ArrayList;
import java.util.List;


public class Empresa extends EntidadeDominio{

	private List<Fornecedor>fornecedor = new ArrayList<Fornecedor>();
	private Os os;
	private TipoEmpresa empresa;
	
	public Empresa(Os os, TipoEmpresa empresa) {
		super();
		this.os = os;
		this.empresa = empresa;
	}

	public List<Fornecedor> getFornecedor() {
		return fornecedor;
	}
	
	public void setFornecedor(List<Fornecedor> fornecedor) {
		this.fornecedor = fornecedor;
	}
	
	public Os getOs() {
		return os;
	}
	
	public void setOs(Os os) {
		this.os = os;
	}
	
	public TipoEmpresa getEmpresa() {
		return empresa;
	}
	
	public void setEmpresa(TipoEmpresa empresa) {
		this.empresa = empresa;
	}
	
	
}
