package com.exemple.serasa.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exemple.serasa.dto.PessoaDto;
import com.exemple.serasa.dto.PessoaDtoId;
import com.exemple.serasa.model.PessoaModel;
import com.exemple.serasa.repository.PessoaRepository;
import com.exemple.serasa.service.PessoaService;

@RestController
@RequestMapping("/pessoa")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class PessoalController {

	@Autowired
	private PessoaRepository repository;
	@Autowired
	private PessoaService pessoaservice;

	
	@PostMapping
	public ResponseEntity<PessoaDto> post (@RequestBody PessoaModel pessoa) {
		
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(pessoaservice.postar(pessoa));
	}
	
	
	@GetMapping
	public ResponseEntity<List<PessoaDto>> listapessoa(){
		return ResponseEntity.ok(pessoaservice.get());
		
	}
	
	@GetMapping("/{id}") //tentei realizar a chamada mas aparentemente no post não está retornando o 204 solicitado
	public PessoaDtoId getById(@PathVariable Long id) {	
		repository.findById(id).map(resp -> ResponseEntity.ok(pessoaservice.getId(id)))
		.orElse(ResponseEntity.status(HttpStatus.NO_CONTENT).build());
		
		return pessoaservice.getId(id);
	}
	
}
