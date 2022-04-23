package com.example.hexagonal.architecture.application.book;

import com.example.hexagonal.architecture.domain.book.model.Book;

public class BookResponse {
  private final long id;

  private final String name;

  private final String author;

  public BookResponse(Book book) {
    this.id = book.getId();
    this.name = book.getName();
    this.author = book.getAuthor();
  }

  public long getId() {
    return id;
  }

  public String getAuthor() {
    return author;
  }

  public String getName() {
    return name;
  }
}
