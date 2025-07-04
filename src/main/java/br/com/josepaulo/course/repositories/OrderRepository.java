package br.com.josepaulo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.josepaulo.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
