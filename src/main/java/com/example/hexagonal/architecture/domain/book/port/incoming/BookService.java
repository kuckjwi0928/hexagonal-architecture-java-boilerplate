package com.example.hexagonal.architecture.domain.book.port.incoming;

import com.example.hexagonal.architecture.domain.book.model.Book;

import java.util.List;

public interface BookService {
  List<Book> getBooks();

  Book getBook(long id);
}
