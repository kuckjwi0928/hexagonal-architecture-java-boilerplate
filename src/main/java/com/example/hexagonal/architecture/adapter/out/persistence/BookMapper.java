package com.example.hexagonal.architecture.adapter.out.persistence;

import com.example.hexagonal.architecture.common.BaseMapper;
import com.example.hexagonal.architecture.domain.Book;
import org.springframework.stereotype.Component;

@Component
public class BookMapper implements BaseMapper<Book, BookJpaEntity> {
  @Override
  public BookJpaEntity mapToEntity(Book book) {
    return new BookJpaEntity(book.getName(), book.getAuthor());
  }

  @Override
  public Book mapToDomain(BookJpaEntity bookJpaEntity) {
    return new Book(bookJpaEntity.getId(), bookJpaEntity.getName(), bookJpaEntity.getAuthor());
  }
}
