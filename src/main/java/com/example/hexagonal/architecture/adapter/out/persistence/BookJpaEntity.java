package com.example.hexagonal.architecture.adapter.out.persistence;

import javax.persistence.*;

@Entity
@Table(name = "book")
public class BookJpaEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
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

  public BookJpaEntity(String name, String author) {
    this.name = name;
    this.author = author;
  }

  protected BookJpaEntity() {}
}
