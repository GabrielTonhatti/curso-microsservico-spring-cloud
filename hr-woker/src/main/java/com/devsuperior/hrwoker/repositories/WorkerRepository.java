package com.devsuperior.hrwoker.repositories;

import com.devsuperior.hrwoker.entities.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository<Worker, Long> {
}
