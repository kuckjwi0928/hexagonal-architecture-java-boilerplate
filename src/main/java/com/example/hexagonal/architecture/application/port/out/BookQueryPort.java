package com.example.hexagonal.architecture.application.port.out;

import com.example.hexagonal.architecture.domain.Book;

import java.util.List;
import java.util.Optional;

public interface BookQueryPort {
  Optional<Book> findById(long id);

  List<Book> findAll();
}
