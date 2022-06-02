package com.example.hexagonal.architecture.application.port.out;

import com.example.hexagonal.architecture.domain.Book;

public interface BookCommandPort {
  Book addBook(Book book);
}
