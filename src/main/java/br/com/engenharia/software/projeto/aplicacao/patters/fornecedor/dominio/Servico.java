package br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.dominio;

import java.time.LocalDate;

public class Servico extends EntidadeDominio{
	
	private Long codigo;
	private String descricao;
	private Fornecedor fornecedor;
	private LocalDate dataInicio;
	private Os os;
	
	public Servico(Long codigo, String descricao, Fornecedor fornecedor, LocalDate dataInicio) {
		super();
		
		this.codigo = codigo;
		this.descricao = descricao;
		this.fornecedor = fornecedor;
		this.dataInicio = dataInicio;
		
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	public LocalDate getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(LocalDate dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Os getOs() {
		return os;
	}

	public void setOs(Os os) {
		this.os = os;
	}
	
}
