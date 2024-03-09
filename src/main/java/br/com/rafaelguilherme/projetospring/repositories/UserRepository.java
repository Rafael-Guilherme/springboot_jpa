package br.com.rafaelguilherme.projetospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.rafaelguilherme.projetospring.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
