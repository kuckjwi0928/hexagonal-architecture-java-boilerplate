package com.example.hexagonal.architecture.adapter.out.persistence;

import com.example.hexagonal.architecture.application.port.out.BookCommandPort;
import com.example.hexagonal.architecture.application.port.out.BookQueryPort;
import com.example.hexagonal.architecture.domain.Book;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class BookRepositoryAdapter implements BookQueryPort, BookCommandPort {
  private final BookDataJpaRepository bookDataJpaRepository;

  private final BookMapper bookMapper;

  public BookRepositoryAdapter(BookDataJpaRepository bookDataJpaRepository, BookMapper bookMapper) {
    this.bookDataJpaRepository = bookDataJpaRepository;
    this.bookMapper = bookMapper;
  }

  @Override
  public Optional<Book> findById(long id) {
    Optional<BookJpaEntity> bookJpaEntity = this.bookDataJpaRepository.findById(id);
    if (bookJpaEntity.isEmpty()) {
      return Optional.empty();
    }
    return Optional.of(bookMapper.mapToDomain(bookJpaEntity.get()));
  }

  @Override
  public List<Book> findAll() {
    return bookMapper.mapToDomains(this.bookDataJpaRepository.findAll());
  }

  @Override
  public Book addBook(Book book) {
    BookJpaEntity bookJpaEntity = this.bookDataJpaRepository.save(bookMapper.mapToEntity(book));
    return bookMapper.mapToDomain(bookJpaEntity);
  }
}
