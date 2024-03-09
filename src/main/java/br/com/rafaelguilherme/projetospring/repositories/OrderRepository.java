package br.com.rafaelguilherme.projetospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.rafaelguilherme.projetospring.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
