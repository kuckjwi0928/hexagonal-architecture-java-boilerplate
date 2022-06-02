package com.example.hexagonal.architecture.application.port.in;

import com.example.hexagonal.architecture.domain.Book;

public class AddBookCommand {
  private final Book book;

  public AddBookCommand(String name, String author) {
    this.book = new Book(null, name, author);
  }

  public Book getBook() {
    return book;
  }
}
