package com.example.hexagonal.architecture.application.port.in;

import com.example.hexagonal.architecture.domain.Book;

import java.util.List;

public interface BookQueryUseCase {
  List<Book> getBooks();

  Book getBook(long id);
}
