package br.com.jorgejr.desafiotodolist.repository;

import br.com.jorgejr.desafiotodolist.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends JpaRepository <Todo, Long> {

}
