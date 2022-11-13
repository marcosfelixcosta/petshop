package com.marcos.petshop.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marcos.petshop.domain.Pessoa;
import com.marcos.petshop.repository.PessoaRepository;
import com.marcos.petshop.service.exceptions.ObjetoNaoEncontradoException;

@Service
public class PessoaService {
	 @Autowired
	 private PessoaRepository repo;
	 
	 public Pessoa Find(Integer id) {
		 
		 Optional<Pessoa> obj = repo.findById(id);
		 return obj.orElseThrow(() -> new ObjetoNaoEncontradoException("Objeto não encontrado. ID:" + id + ", Tipo:" + Pessoa.class.getName()) );
	 
	 }
	 
	 

}
