package com.exemple.serasa.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.exemple.serasa.dto.PessoaDto;

import lombok.Data;

@Entity
@Data
@Table(name = "db_pessoa")
public class PessoaModel {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	
	private String telefone;
	
	private int idade;
	
	private String cidade;
	
	private String estado;
	
	private int score;

	 @Transient
	    @Enumerated(EnumType.STRING)
	    private ScoreDescricao scoreDescricao;
	
	public PessoaModel() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public ScoreDescricao getScoreDescricao() {
		return scoreDescricao;
	}

	public void setScoreDescricao(ScoreDescricao scoreDescricao) {
		this.scoreDescricao = scoreDescricao;
	}

	public void add(List<PessoaDto> pessoasdtos) {
		// TODO Auto-generated method stub
		
	}
	
}
