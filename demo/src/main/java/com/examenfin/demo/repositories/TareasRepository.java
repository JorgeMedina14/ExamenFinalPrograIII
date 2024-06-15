package com.examenfin.demo.repositories;

import com.examenfin.demo.entities.Tareas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TareasRepository extends JpaRepository<Tareas, Long> {
}
