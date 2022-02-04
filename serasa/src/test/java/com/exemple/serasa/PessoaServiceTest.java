package com.exemple.serasa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.exemple.serasa.dto.PessoaDto;
import com.exemple.serasa.dto.PessoaDtoId;
import com.exemple.serasa.model.PessoaModel;
import com.exemple.serasa.repository.PessoaRepository;
import com.exemple.serasa.service.PessoaService;

@DisplayName("PessoaServiceTest")
@SpringBootTest
@AutoConfigureMockMvc
@ExtendWith(MockitoExtension.class)
public class PessoaServiceTest extends AppConfigTest{

	@MockBean
	public PessoaDto pessoadto;
	
	@MockBean
	public PessoaDtoId pessoadtoid;
	
	@MockBean
	private PessoaRepository repository;
	
	@Autowired
	private PessoaService pessoaservice;
	
	@Autowired
	private PessoaModel pessoa;
	
	/*@Test
	public void teste1() {
		System.out.println("ok");
	};*/
	
	@Test
	@DisplayName("Deve postar o imput do usuario")
	public void teste2() {
		Assertions.assertDoesNotThrow(() -> pessoaservice.postar(mock()));
	}
	
	PessoaModel mock() {
		PessoaModel a = new PessoaModel();
		PessoaDto b = new PessoaDto();
		
		a.setNome("Jaqueline");
		a.setCidade("Sao Paulo");
		a.setEstado("SP");
		b.setScoreDescricao("ACEITAVEL");
		return a;
	}
}
