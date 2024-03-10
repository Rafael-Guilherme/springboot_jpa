package br.com.rafaelguilherme.projetospring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.rafaelguilherme.projetospring.entities.User;
import br.com.rafaelguilherme.projetospring.repositories.UserRepository;
import br.com.rafaelguilherme.projetospring.services.exceptions.ResourceNotFoundException;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll() {
        return repository.findAll();
    }

    public User findById(Long id) {
        if (id != null) {
            Optional<User> obj = repository.findById(id);
            return obj.orElseThrow(() -> new ResourceNotFoundException(id));
        }
        return null;
    }

    public User insert(User obj) {
        if (obj != null) {
            return repository.save(obj);
        }
        return null;
    }

    public void delete(Long id) {
        if (id != null) {
            repository.deleteById(id);
        }
    }

    public User update(Long id, User obj) {
        if (id != null && obj != null) {
            User entity = repository.getReferenceById(id);
            updateData(entity, obj);
            return repository.save(entity);
        }
        return null;
    }

    private void updateData(User entity, User obj) {
        entity.setName(obj.getName());
        entity.setEmail(obj.getEmail());
        entity.setPhone(obj.getPhone());
    }
}
