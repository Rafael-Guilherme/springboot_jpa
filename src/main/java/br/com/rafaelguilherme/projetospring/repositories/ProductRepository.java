package br.com.rafaelguilherme.projetospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.rafaelguilherme.projetospring.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
