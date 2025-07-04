//***************************************************************
package com.marcos.petshop.utils;

import java.util.Arrays;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.marcos.petshop.domain.Categoria;
import com.marcos.petshop.domain.Cidade;
import com.marcos.petshop.domain.Cliente;
import com.marcos.petshop.domain.Endereco;
import com.marcos.petshop.domain.Especie;
import com.marcos.petshop.domain.Estado;
import com.marcos.petshop.domain.Funcionario;
import com.marcos.petshop.domain.Pet;
import com.marcos.petshop.domain.Produto;
import com.marcos.petshop.domain.Raca;
import com.marcos.petshop.repository.CategoriaRepository;
import com.marcos.petshop.repository.CidadeRepository;
import com.marcos.petshop.repository.EnderecoRepository;
import com.marcos.petshop.repository.EspecieRepository;
import com.marcos.petshop.repository.EstadoRepository;
import com.marcos.petshop.repository.PessoaRepository;
import com.marcos.petshop.repository.PetRepository;
import com.marcos.petshop.repository.ProdutoRepository;
import com.marcos.petshop.repository.RacaRepository;

@Component
public class PopulaDados {
	
	@Autowired
	CategoriaRepository categoriaRepository;
	
	@Autowired
	ProdutoRepository produtoRepository;
	
	@Autowired
	PetRepository petRepository;
	
	@Autowired
	EspecieRepository especieRepository;
	
	@Autowired
	RacaRepository racaRepository;
	
	@Autowired
	EstadoRepository estadoRepository;
	
	@Autowired
	CidadeRepository cidadeRepository;
	
	@Autowired
	PessoaRepository pessoaRepository;
	
	@Autowired
	EnderecoRepository enderecoRepository;
	
	
	@PostConstruct
	public void cadastrar() {
		
		Categoria cat1 = new Categoria(null, "Alimento");
		Categoria cat2 = new Categoria(null, "Remédio");
		Categoria cat3 = new Categoria(null, "Cosmético");
	
		Produto p1 = new Produto(null,"Ração", 100.0);
		Produto p2 = new Produto(null,"Sache", 80.0);
		Produto p3 = new Produto(null,"Vermefugo", 90.0);
		Produto p4 = new Produto(null,"Shampoo", 150.0); 
		
		cat1.getProdutos().addAll(Arrays.asList(p1,p2));
		cat2.getProdutos().addAll(Arrays.asList(p3,p4));
		cat3.getProdutos().addAll(Arrays.asList(p4));
		
		p1.getCategorias().addAll(Arrays.asList(cat1));
		p2.getCategorias().addAll(Arrays.asList(cat1));
		p3.getCategorias().addAll(Arrays.asList(cat2));
		p4.getCategorias().addAll(Arrays.asList(cat2,cat3));
		
		
		categoriaRepository.saveAll(Arrays.asList(cat1,cat2,cat3));
		produtoRepository.saveAll(Arrays.asList(p1,p2,p3,p4));
		
		Especie esp1 = new Especie(null, "Cachorro");
		Especie esp2 = new Especie(null, "Gato");
		
		Raca rac1 = new Raca(null, "Shitzu");
		Raca rac2 = new Raca(null, "Akita");
		Raca rac3 = new Raca(null, "Persa");
		
		
		Pet pet1 = new Pet(null, "Markão", 7, esp1, rac1);
		Pet pet2 = new Pet(null, "Gatinha", 3, esp1, rac2);
		Pet pet3 = new Pet(null, "Mewth", 8, esp2, rac3);
		
		especieRepository.saveAll(Arrays.asList(esp1,esp2));
		racaRepository.saveAll(Arrays.asList(rac1, rac2, rac3));
		
		petRepository.saveAll(Arrays.asList(pet1,pet2,pet3));
		
		Estado est1 = new Estado(null, "Minas Gerais");		
		Estado est2 = new Estado(null, "São Pualo");
		
		Cidade cid1 = new Cidade(null, "Belo Horizonte", est1);
		Cidade cid2 = new Cidade(null, "Capelinha", est1);
		Cidade cid3 = new Cidade(null, "São Paulo", est2);
		
		est1.getCidades().addAll(Arrays.asList(cid1,cid2));
		est1.getCidades().addAll(Arrays.asList(cid3));
		
		estadoRepository.saveAll(Arrays.asList(est1,est2));
		cidadeRepository.saveAll(Arrays.asList(cid1,cid2,cid3));
		

		Cliente clt1 = new Cliente(null, "Jose Maria", "jose@mail.com", "335.194.320-21", "FISICA");
		clt1.getTelefones().addAll(Arrays.asList("3516-2000","9191-0000"));
		
		Funcionario fnc1 = new Funcionario(null, "Marcos Costa", "maria@mail.com", "551.872.200.12", "ANALISTA");
		fnc1.getTelefones().addAll(Arrays.asList("3279-0001","9090-0002"));
		
		Endereco end1 = new Endereco(null, "Rua Tupis", "500", "Apto 101", "Pindorama", "30111222", clt1, cid1);
		Endereco end2 = new Endereco(null, "Av. Tamoios", "100", "Casa", "Oca", "3968000", fnc1, cid2);
		Endereco end3 = new Endereco(null, "Rua Aranãs", "10", "Apto 201", "Centro", "01153000", fnc1, cid3);
		
		pessoaRepository.saveAll(Arrays.asList(clt1, fnc1));
		enderecoRepository.saveAll(Arrays.asList(end1,end2,end3));
		
	}

}



























