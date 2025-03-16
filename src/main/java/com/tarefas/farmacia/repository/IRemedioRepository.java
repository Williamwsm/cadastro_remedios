package com.tarefas.farmacia.repository;

import com.tarefas.farmacia.model.Remedio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRemedioRepository extends JpaRepository<Remedio, Long> {
}
