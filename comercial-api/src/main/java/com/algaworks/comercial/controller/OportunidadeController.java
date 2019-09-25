package com.algaworks.comercial.controller;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.comercial.model.Oportunidade;

// Primeira anotação indica que esta classe é um controller 
//A segunda anotação indica a rota da requisição 
//GET http://localhost:8080/oportunidades

@RestController
@RequestMapping("/oportunidades")
public class OportunidadeController {
	
	@GetMapping
	public List<Oportunidade> listar() {
		Oportunidade oportunidade = new Oportunidade();
		oportunidade.setId(1L);
		oportunidade.setDescricao("Desenvolvimento de ERP com Angular e Spring");
		oportunidade.setNomeProspecto("Grupo Logística Brasil");
		oportunidade.setValor(new BigDecimal(490000));
		
		return Arrays.asList(oportunidade);
	}
	
}
