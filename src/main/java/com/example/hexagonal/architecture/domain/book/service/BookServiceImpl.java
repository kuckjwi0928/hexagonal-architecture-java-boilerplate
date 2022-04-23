package com.example.hexagonal.architecture.domain.book.service;

import com.example.hexagonal.architecture.domain.book.model.Book;
import com.example.hexagonal.architecture.domain.book.port.incoming.BookService;
import com.example.hexagonal.architecture.domain.book.port.outgoing.BookRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
  private final BookRepository bookService;

  public BookServiceImpl(BookRepository bookService) {
    this.bookService = bookService;
  }

  @Override
  public List<Book> getBooks() {
    return bookService.findAll();
  }

  @Override
  public Book getBook(long id) {
    return bookService.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
  }
}
