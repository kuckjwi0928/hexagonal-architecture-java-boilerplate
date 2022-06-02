package com.example.hexagonal.architecture.domain;

public final class Book {
  private final Long id;

  private final String name;

  private final String author;

  public Long getId() {
    return this.id;
  }

  public String getName() {
    return this.name;
  }

  public String getAuthor() {
    return this.author;
  }

  public Book(Long id, String name, String author) {
    this.id = id;
    this.name = name;
    this.author = author;
  }
}
