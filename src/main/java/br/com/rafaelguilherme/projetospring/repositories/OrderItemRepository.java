package br.com.rafaelguilherme.projetospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.rafaelguilherme.projetospring.entities.OrderItem;
import br.com.rafaelguilherme.projetospring.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
