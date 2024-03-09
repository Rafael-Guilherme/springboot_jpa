package br.com.rafaelguilherme.projetospring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.rafaelguilherme.projetospring.entities.Order;
import br.com.rafaelguilherme.projetospring.repositories.OrderRepository;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public List<Order> findAll() {
        return repository.findAll();
    }

    public Order findById(Long id) {
        @SuppressWarnings("null")
        Optional<Order> obj = repository.findById(id);
        return obj.get();
    }
}
