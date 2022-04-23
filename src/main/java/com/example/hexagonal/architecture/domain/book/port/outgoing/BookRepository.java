package com.example.hexagonal.architecture.domain.book.port.outgoing;

import com.example.hexagonal.architecture.domain.book.model.Book;

import java.util.List;
import java.util.Optional;

public interface BookRepository {
  Optional<Book> findById(long id);

  List<Book> findAll();
}
