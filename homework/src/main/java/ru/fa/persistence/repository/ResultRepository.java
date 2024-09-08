package ru.fa.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.fa.persistence.model.Result;

@Repository
public interface ResultRepository extends JpaRepository<Result, Long> {
}
