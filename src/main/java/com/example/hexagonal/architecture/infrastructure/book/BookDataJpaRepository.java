package com.example.hexagonal.architecture.infrastructure.book;

import com.example.hexagonal.architecture.domain.book.model.Book;
import com.example.hexagonal.architecture.domain.book.port.outgoing.BookRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookDataJpaRepository extends BookRepository, CrudRepository<Book, Long> {
}
