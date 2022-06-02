package com.example.hexagonal.architecture.application.port.in;

import com.example.hexagonal.architecture.domain.Book;

public interface AddBookCommandUseCase {
  Book addBook(AddBookCommand command);
}
