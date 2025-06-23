package com.taylorsz.crud.user.core;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.taylorsz.crud.user.persistence.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository repository;

    public User save(User user) {
        return repository.save(user);
    }

    public User findById(Long id) {
        return repository.findById(id).orElseThrow(() -> new UserNotFoundException("User not found"));
    }

    public List<User> findAll() {
        return repository.findAll();
    }

    public void update(User user) {
        findById(user.getId());
        save(user);
    }

    public void delete(Long id) {
        findById(id);
        repository.deleteById(id);
    }
}
