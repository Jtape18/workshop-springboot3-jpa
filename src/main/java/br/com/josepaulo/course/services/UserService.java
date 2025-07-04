package br.com.josepaulo.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.josepaulo.course.entities.User;
import br.com.josepaulo.course.repositories.UserRespository;

@Service
public class UserService {

    @Autowired
    private UserRespository respository;

    public List<User> findAll() {
        return respository.findAll();
    }

    public User findById(Long id) {
        Optional<User> obj = respository.findById(id);
        return obj.get();
    }
}
