//Projeto PetShop

package com.marcos.petshop.resurces;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.marcos.petshop.domain.Pessoa;
import com.marcos.petshop.service.PessoaService;

@RestController
@RequestMapping(value = "/pessoas")

public class PessoaResurce {
	
@Autowired
PessoaService service;
	
@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
	 
	Pessoa obj = service.Find(id);	 	
	return ResponseEntity.ok().body(obj);
	}

}






