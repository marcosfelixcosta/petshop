package com.marcos.petshop.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marcos.petshop.domain.Categoria;
import com.marcos.petshop.repository.CategoriaRepository;

@Service
public class CategoriaService {
	 @Autowired
	 private CategoriaRepository repo;
	 
	 public Categoria Find(Integer id) {
		 
		 Optional<Categoria> obj = repo.findById(id);
		 return obj.orElse(null);
	 }
	 
	 

}
