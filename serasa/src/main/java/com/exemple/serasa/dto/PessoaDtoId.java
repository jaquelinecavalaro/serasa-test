package com.exemple.serasa.dto;

import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.Entity;

import com.exemple.serasa.model.PessoaModel;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//dto feito para chamada id

public class PessoaDtoId {
	
	private String nome;
	
	private String telefone;
	
	private int idade;
	
	private String scoreDescricao;

	public PessoaDtoId() {
		super();
	}
	
	public PessoaDtoId(PessoaModel pessoamodel) {
		this.nome = pessoamodel.getNome();
		this.telefone = pessoamodel.getTelefone();
		this.idade = pessoamodel.getIdade();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getScoreDescricao() {
		return scoreDescricao;
	}

	public void setScoreDescricao(String scoreDescricao) {
		this.scoreDescricao = scoreDescricao;
	}

//	public Object map(Object object) {
//		public List<UsuarioModel> findAllByNomeCompletoContainingIgnoreCase(String nomeCompleto);
//
//		public Optional<UsuarioModel> findByEmailUsuario(String emailUsuario);
//	}

	
	
}
