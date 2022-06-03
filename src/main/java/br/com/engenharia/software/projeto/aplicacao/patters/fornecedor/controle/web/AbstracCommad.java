package br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.controle.web;

import br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.controle.IFachada;
import br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.controle.implementacao.Fachada;

public abstract class AbstracCommad implements ICommand {

	protected IFachada fachada = new Fachada();
}
