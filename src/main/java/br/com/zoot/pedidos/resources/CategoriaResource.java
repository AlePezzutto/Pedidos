package br.com.zoot.pedidos.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.zoot.pedidos.domains.Categoria;
import br.com.zoot.pedidos.services.CategoriaService;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {

	private CategoriaService service;
	
	public CategoriaResource(CategoriaService service) {
		this.service = service;		
	}
	
	@GetMapping
	public ResponseEntity<?> listar() {
		return ResponseEntity.ok().body(this.service.getCategorias());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> find(@PathVariable Integer id) {
		Categoria cat = this.service.getCategoria(id);
		return ResponseEntity.ok().body(cat);
	}
}
