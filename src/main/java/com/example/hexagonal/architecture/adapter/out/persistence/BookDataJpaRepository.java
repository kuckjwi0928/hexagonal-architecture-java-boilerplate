package com.example.hexagonal.architecture.adapter.out.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookDataJpaRepository extends JpaRepository<BookJpaEntity, Long> {
}
