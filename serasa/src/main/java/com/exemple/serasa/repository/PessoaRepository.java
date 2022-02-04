package com.exemple.serasa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exemple.serasa.model.PessoaModel;
@Repository
public interface PessoaRepository extends JpaRepository <PessoaModel, Long>{
	
	public List<PessoaModel>findAllByNomeContainingIgnoreCase(String nome);

}
