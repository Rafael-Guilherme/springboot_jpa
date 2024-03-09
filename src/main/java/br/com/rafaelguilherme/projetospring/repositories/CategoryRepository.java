package br.com.rafaelguilherme.projetospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.rafaelguilherme.projetospring.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
