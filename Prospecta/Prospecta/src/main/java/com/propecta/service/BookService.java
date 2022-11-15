package com.propecta.service;

import com.propecta.entity.Book;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BookService {
    public Book addBook(Book book);

    public Book viewBookById(Integer id);

    public List<Book> viewAllBook();

    public List<Book> viewByCategory(String category);

    public Book viewByName(String name);

    public List<Book> viewByAuthor(String author);

}
