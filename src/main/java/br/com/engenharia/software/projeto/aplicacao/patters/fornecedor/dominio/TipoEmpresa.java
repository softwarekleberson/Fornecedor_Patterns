package br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.dominio;

public class TipoEmpresa extends EntidadeDominio{
	
	 public static final String FILIAL = "FILIAL";
	 public static final String MATRIZ = "MATRIZ";
	 private Empresa empresa;
	 
	 public TipoEmpresa(Empresa empresa) {
		super();
		this.empresa = empresa;
	}
	 
	public Empresa getEmpresa() {
		return empresa;
	}
	
	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	
	public String getFILIAL() {
		return FILIAL;
	}
	
	public String getMATRIZ() {
		return MATRIZ;
	}
	 
	 
	
}
