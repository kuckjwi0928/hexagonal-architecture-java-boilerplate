package com.example.hexagonal.architecture.application.book;

import com.example.hexagonal.architecture.domain.book.port.incoming.BookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/books")
public class BookController {
  private final BookService bookService;

  public BookController(BookService bookService) {
    this.bookService = bookService;
  }

  @GetMapping
  public List<BookResponse> getBooks() {
    return bookService.getBooks().stream().map(BookResponse::new).collect(Collectors.toList());
  }

  @GetMapping("{id}")
  public BookResponse getBook(@PathVariable("id") long id) {
    return new BookResponse(bookService.getBook(id));
  }
}
