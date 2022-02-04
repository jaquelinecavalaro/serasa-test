package com.exemple.serasa.service;



import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.exemple.serasa.dto.PessoaDto;
import com.exemple.serasa.dto.PessoaDtoId;
import com.exemple.serasa.model.PessoaModel;
import com.exemple.serasa.model.ScoreDescricao;
import com.exemple.serasa.repository.PessoaRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
public class PessoaService {
	
	@Autowired
	private PessoaRepository repository;

	public PessoaDto postar(PessoaModel pessoa) { //utilizando o dto na minha camada service para conseguir chamar o scoreDescricao
		PessoaDto pessoadto = new PessoaDto();
		
		pessoadto.setNome(pessoa.getNome());
		pessoadto.setCidade(pessoa.getCidade());
		pessoadto.setEstado(pessoa.getEstado());
		
		if(pessoa.getScore() == 0 || pessoa.getScore() <=200) {
			pessoa.setScoreDescricao(ScoreDescricao.INSUFICIENTE);
			pessoadto.setScoreDescricao(ScoreDescricao.INSUFICIENTE.name());
		}else if (pessoa.getScore() == 201 || pessoa.getScore() <=500) {
			pessoa.setScoreDescricao(ScoreDescricao.INACEITAVEL);
			pessoadto.setScoreDescricao(ScoreDescricao.INACEITAVEL.name());
		}else if (pessoa.getScore() == 501 || pessoa.getScore() <=700) {
			pessoa.setScoreDescricao(ScoreDescricao.ACEITAVEL);
			pessoadto.setScoreDescricao(ScoreDescricao.ACEITAVEL.name());
		}else if (pessoa.getScore() == 701 || pessoa.getScore() <=1000) {
			pessoa.setScoreDescricao(ScoreDescricao.RECOMENDAVEL);
			pessoadto.setScoreDescricao(ScoreDescricao.RECOMENDAVEL.name());
		}
		repository.save(pessoa);
		return pessoadto;
	}

	public List<PessoaDto> get() {
		List<PessoaDto>pessoasdtos=new ArrayList(); //array para chamar todos do meu banco e dados
		PessoaDto pessoadto = new PessoaDto();
		List<PessoaModel>pessoasmodels=repository.findAll();
		for (PessoaModel x : pessoasmodels) {
			pessoadto.setNome(x.getNome());
			pessoadto.setCidade(x.getCidade());
			pessoadto.setEstado(x.getEstado());
			
			if(pessoasmodels.get(0).getScore() == 0 || pessoasmodels.get(0).getScore() <=200) {
				pessoadto.setScoreDescricao(ScoreDescricao.INSUFICIENTE.name());
			}else if (pessoasmodels.get(0).getScore() == 201 || pessoasmodels.get(0).getScore() <=500) {
				pessoadto.setScoreDescricao(ScoreDescricao.INACEITAVEL.name());
			}else if (pessoasmodels.get(0).getScore() == 501 || pessoasmodels.get(0).getScore() <=700) {
				pessoadto.setScoreDescricao(ScoreDescricao.ACEITAVEL.name());
			}else if (pessoasmodels.get(0).getScore() == 701 || pessoasmodels.get(0).getScore() <=1000) {
				pessoadto.setScoreDescricao(ScoreDescricao.RECOMENDAVEL.name());
			}
			
			pessoasdtos.add(pessoadto);
		}
		return pessoasdtos;
	}

	public PessoaDtoId getId(Long id) {
		PessoaModel pessoamodel=new PessoaModel();
		PessoaDtoId pessoadto=new PessoaDtoId();
		
		pessoamodel=repository.findById(id).get();
		
		pessoadto.setNome(pessoamodel.getNome());
		pessoadto.setTelefone(pessoamodel.getTelefone());
		pessoadto.setIdade(pessoamodel.getIdade());

		
		if(pessoamodel.getScore() == 0 || pessoamodel.getScore() <=200) {
			pessoadto.setScoreDescricao(ScoreDescricao.INSUFICIENTE.name());
		}else if (pessoamodel.getScore() == 201 || pessoamodel.getScore() <=500) {
			pessoadto.setScoreDescricao(ScoreDescricao.INACEITAVEL.name());
		}else if (pessoamodel.getScore() == 501 || pessoamodel.getScore() <=700) {
			pessoadto.setScoreDescricao(ScoreDescricao.ACEITAVEL.name());
		}else if (pessoamodel.getScore() == 701 || pessoamodel.getScore() <=1000) {
			pessoadto.setScoreDescricao(ScoreDescricao.RECOMENDAVEL.name());
		}
		
		return pessoadto;
	}
	
	
	
}
