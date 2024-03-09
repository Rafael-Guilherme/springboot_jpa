package br.com.rafaelguilherme.projetospring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.rafaelguilherme.projetospring.entities.User;
import br.com.rafaelguilherme.projetospring.repositories.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll() {
        return repository.findAll();
    }

    public User findById(Long id) {
        @SuppressWarnings("null")
        Optional<User> obj = repository.findById(id);
        return obj.get();
    }
}
