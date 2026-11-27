package com.spring.tarefas.repository;

import com.spring.tarefas.entity.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TarefasRepository extends JpaRepository<Tarefa, Integer>, CrudRepository<Tarefa, Integer> {
}
