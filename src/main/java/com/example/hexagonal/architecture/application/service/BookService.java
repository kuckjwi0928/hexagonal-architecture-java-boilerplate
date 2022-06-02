package com.example.hexagonal.architecture.application.service;

import com.example.hexagonal.architecture.application.port.in.AddBookCommand;
import com.example.hexagonal.architecture.application.port.in.AddBookCommandUseCase;
import com.example.hexagonal.architecture.application.port.in.BookQueryUseCase;
import com.example.hexagonal.architecture.application.port.out.BookCommandPort;
import com.example.hexagonal.architecture.application.port.out.BookQueryPort;
import com.example.hexagonal.architecture.domain.Book;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import javax.transaction.Transactional;
import java.util.List;

@Service
class BookService implements BookQueryUseCase, AddBookCommandUseCase {
  private final BookQueryPort bookQueryPort;
  private final BookCommandPort bookCommandPort;

  public BookService(BookQueryPort bookQueryPort, BookCommandPort bookCommandPort) {
    this.bookQueryPort = bookQueryPort;
    this.bookCommandPort = bookCommandPort;
  }

  @Override
  public List<Book> getBooks() {
    return bookQueryPort.findAll();
  }

  @Override
  public Book getBook(long id) {
    return bookQueryPort.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
  }

  @Transactional
  @Override
  public Book addBook(AddBookCommand command) {
    return bookCommandPort.addBook(command.getBook());
  }
}
