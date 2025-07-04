package br.com.josepaulo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.josepaulo.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
