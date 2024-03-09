package br.com.rafaelguilherme.projetospring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.rafaelguilherme.projetospring.entities.Product;
import br.com.rafaelguilherme.projetospring.repositories.ProductRepository;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;

    public List<Product> findAll() {
        return repository.findAll();
    }

    public Product findById(Long id) {
        @SuppressWarnings("null")
        Optional<Product> obj = repository.findById(id);
        return obj.get();
    }
}
