package com.example.hexagonal.architecture.adapter.in.rest;

import com.example.hexagonal.architecture.application.port.in.AddBookCommand;
import com.example.hexagonal.architecture.application.port.in.AddBookCommandUseCase;
import com.example.hexagonal.architecture.application.port.in.BookQueryUseCase;
import com.example.hexagonal.architecture.domain.Book;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BookRestController {
  private final AddBookCommandUseCase addBookCommandUseCase;

  private final BookQueryUseCase bookQueryUseCase;

  public BookRestController(BookQueryUseCase bookQueryUseCase, AddBookCommandUseCase addBookCommandUseCase) {
    this.bookQueryUseCase = bookQueryUseCase;
    this.addBookCommandUseCase = addBookCommandUseCase;
  }

  @GetMapping
  public List<Book> getBooks() {
    return this.bookQueryUseCase.getBooks();
  }

  @GetMapping("{id}")
  public Book getBook(@PathVariable("id") long id) {
    return this.bookQueryUseCase.getBook(id);
  }

  @PostMapping
  public Book addBook(@Valid @RequestBody AddBookRequest request) {
    return this.addBookCommandUseCase.addBook(new AddBookCommand(request.getName(), request.getAuthor()));
  }
}
