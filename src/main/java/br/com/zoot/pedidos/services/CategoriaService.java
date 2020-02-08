package br.com.zoot.pedidos.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.zoot.pedidos.domains.Categoria;
import br.com.zoot.pedidos.repositories.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;
	
	public List<Categoria> getCategorias(){
		return this.repo.findAll();
	}
	
	public Categoria getCategoria(Integer id) {
		
		Optional<Categoria> opt = repo.findById(id);
		
		return opt.orElse(null);
		//return opt.orElseThrow(() -> new ObjectNotFoundException(
		//		"Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
	}
	
}
