package com.example.hexagonal.architecture.adapter.in.rest;

import javax.validation.constraints.NotEmpty;

public class AddBookRequest {
  @NotEmpty
  private String name;

  @NotEmpty
  private String author;

  public String getName() {
    return name;
  }

  public String getAuthor() {
    return author;
  }
}
