package com.example.hexagonal.architecture.domain.book.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {
  @Id
  private long id;

  private String name;

  private String author;

  public long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getAuthor() {
    return author;
  }
}
