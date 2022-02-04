package com.exemple.serasa.dto;


import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;

import com.exemple.serasa.model.PessoaModel;
import com.exemple.serasa.service.PessoaService;

//dto feito para chamada /pessoa
public class PessoaDto implements Serializable{
	private static final long serialVersionUID = 1L;

	
	private String nome;

	private String cidade;
	
	private String estado;
	
	private String scoreDescricao;

	public PessoaDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PessoaDto(PessoaModel pessoamodel) {
		this.nome = pessoamodel.getNome();
		this.cidade = pessoamodel.getCidade();
		this.estado = pessoamodel.getEstado();
		//servicescoreDescricao = service.getScoreDescricao();
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getScoreDescricao() {
		return scoreDescricao;
	}

	public void setScoreDescricao(String scoreDescricao) {
		this.scoreDescricao = scoreDescricao;
	}

	public void add(List<PessoaDto> pessoasdtos) {
		// TODO Auto-generated method stub
		
	}


	

	
}
