package br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.controle.implementacao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.controle.IFachada;
import br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.dao.IDAO;
import br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.dao.implementacao.EnderecoDao;
import br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.dao.implementacao.FornecedorDao;
import br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.dao.implementacao.PessoaDao;
import br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.dominio.Empresa;
import br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.dominio.Endereco;
import br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.dominio.EntidadeDominio;
import br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.dominio.Fornecedor;
import br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.dominio.Pessoa;
import br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.negocio.IStrategy;
import br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.negocio.implementacao.ValidaCidade;
import br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.negocio.implementacao.ValidaCnae;
import br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.negocio.implementacao.ValidaContato;
import br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.negocio.implementacao.ValidaDepartamento;
import br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.negocio.implementacao.ValidaEndereco;
import br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.negocio.implementacao.ValidaExistencia;
import br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.negocio.implementacao.ValidaFornecedor;
import br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.negocio.implementacao.ValidaOs;
import br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.negocio.implementacao.ValidaPais;
import br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.negocio.implementacao.ValidaPessoa;
import br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.negocio.implementacao.ValidaProduto;
import br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.negocio.implementacao.ValidaRamal;
import br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.negocio.implementacao.ValidaServico;
import br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.negocio.implementacao.ValidaStatus;
import br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.negocio.implementacao.ValidaTelefone;
import br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.negocio.implementacao.ValidaTipoEmpresa;
import br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.negocio.implementacao.ValidaTipoEndereco;
import br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.negocio.implementacao.ValidaTipoFornecimento;
import br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.negocio.implementacao.ValidaTipoLogradouro;
import br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.negocio.implementacao.ValidaTipoTelefone;
import br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.negocio.implementacao.ValidaUf;
import br.com.engenharia.software.projeto.aplicacao.patters.fornecedor.negocio.implementacao.ValidaUsuario;

public class Fachada implements IFachada{
	
	private Map<String, IDAO> daos = new HashMap<String, IDAO>(); 
	private Map<String, List<IStrategy>> rns = new HashMap<String, List <IStrategy>>();
	
	public Fachada() {
		
		String nmFornecedor = Fornecedor.class.getName();
		daos.put(nmFornecedor, new FornecedorDao());
		
		String nmEndereco = Endereco.class.getName();
		daos.put(nmEndereco, new EnderecoDao());
		
		String nmPessoa = Pessoa.class.getName();
		daos.put(nmPessoa, new PessoaDao());
		
		
		ValidaCidade vCidade = new ValidaCidade();
		ValidaCnae vCnae = new ValidaCnae();
		ValidaContato vContato = new ValidaContato();
		ValidaDepartamento vDepartamento = new ValidaDepartamento();
		ValidaEndereco vEndereco = new ValidaEndereco();
		ValidaExistencia vExistencia = new ValidaExistencia();
		ValidaFornecedor vFornecedor = new ValidaFornecedor();
		ValidaPais vPais = new ValidaPais();
		ValidaPessoa vPessoa = new ValidaPessoa();
		ValidaProduto vProduto = new ValidaProduto();
		ValidaRamal vRamal = new ValidaRamal();
		ValidaServico vServico = new ValidaServico();
		ValidaStatus vStatus = new ValidaStatus();
		ValidaTelefone vTelefone = new ValidaTelefone();
		ValidaTipoEmpresa vTipoEmpresa = new ValidaTipoEmpresa();
		ValidaTipoEndereco vTipoEndereco = new ValidaTipoEndereco();
		ValidaTipoFornecimento vTipoFornecimento = new ValidaTipoFornecimento();
		ValidaTipoLogradouro vTipoLogradouro = new ValidaTipoLogradouro();
		ValidaTipoTelefone vTipoTelefone = new ValidaTipoTelefone();
		ValidaUf vUf = new ValidaUf();
		ValidaUsuario vUsuario = new ValidaUsuario();
		ValidaOs vOs = new ValidaOs();
		
		ArrayList<IStrategy>rnsEndereco = new ArrayList<IStrategy>();
		rnsEndereco.add(vTipoEndereco);
		rnsEndereco.add(vEndereco);
		rnsEndereco.add(vTipoLogradouro);
		rnsEndereco.add(vCidade);
		rnsEndereco.add(vUf);
		rnsEndereco.add(vPais);
		
		
		ArrayList<IStrategy>rnsFornecedor = new ArrayList<IStrategy>();
		rnsFornecedor.add(vFornecedor);
		rnsFornecedor.add(vOs);
		rnsFornecedor.add(vServico);
		rnsFornecedor.add(vTipoEmpresa);
		rnsFornecedor.add(vStatus);
		rnsFornecedor.add(vProduto);
		rnsFornecedor.add(vCnae);
		rnsFornecedor.add(vTipoFornecimento);
		
		
		ArrayList<IStrategy>rnsPessoa = new ArrayList<IStrategy>();
		rnsPessoa.add(vUsuario);
		rnsPessoa.add(vPessoa);
		rnsPessoa.add(vContato);
		rnsPessoa.add(vDepartamento);
		rnsPessoa.add(vTelefone);
		rnsPessoa.add(vRamal);
		rnsPessoa.add(vTipoTelefone);
		
		rns.put(nmPessoa, rnsPessoa);
		rns.put(nmEndereco, rnsEndereco);
		rns.put(nmFornecedor, rnsFornecedor);

	}
	
	
	public String salvar(EntidadeDominio entidadeDominio) {
		StringBuilder sb = new StringBuilder();
		String nmEntidade = entidadeDominio.getClass().getName();
		List<IStrategy> regras = rns.get(nmEntidade);
		
		for (IStrategy s : regras) {
			String msg = s.processar(entidadeDominio);
			if(msg != null) {
				sb.append(msg);
				sb.append("\n");
			}
		}
		
		if(sb.length() == 0) {
			IDAO dao = daos.get(nmEntidade);
			dao.salvar(entidadeDominio);
		}else {
			return sb.toString();
		}
		
		return null;
	}

	public String alterar(EntidadeDominio entidadeDominio) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<EntidadeDominio> consultar(EntidadeDominio entidadeDominio) {
		// TODO Auto-generated method stub
		return null;
	}

	public String excluir(EntidadeDominio entidadeDominio) {
		// TODO Auto-generated method stub
		return null;
	}

	public String inativar(EntidadeDominio entidadeDominio) {
		// TODO Auto-generated method stub
		return null;
	}

	public String ativar(EntidadeDominio entidadeDominio) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<EntidadeDominio> listaFornecimento(EntidadeDominio entidadeDominio) {
		// TODO Auto-generated method stub
		return null;
	}

	public String adicionaContatoEmail(EntidadeDominio entidadeDominio) {
		// TODO Auto-generated method stub
		return null;
	}

	public String adicionaContatoTelefone(EntidadeDominio entidadeDominio) {
		// TODO Auto-generated method stub
		return null;
	}

	public String adicionaTelefoneEmail(EntidadeDominio entidadeDominio) {
		// TODO Auto-generated method stub
		return null;
	}

	public String validaCnpj(EntidadeDominio entidadeDominio) {
		// TODO Auto-generated method stub
		return null;
	}

	public String validaListaFornecimento(EntidadeDominio entidadeDominio) {
		// TODO Auto-generated method stub
		return null;
	}

}
