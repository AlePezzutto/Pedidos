package br.com.zoot.pedidos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.zoot.pedidos.domains.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

}
