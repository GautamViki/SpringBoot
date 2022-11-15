package com.propecta.repositery;

import com.propecta.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookDao extends JpaRepository<Book, Integer> {
    public List<Book> findByCategory(String category);

    public Book findByBookName(String book);

    public List<Book> findByAuthor(String author);

}
