package com.propecta.service;

import com.propecta.entity.Book;
import com.propecta.repositery.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao bookDao;

    @Override
    public Book addBook(Book book) {
        return bookDao.save(book);
    }

    @Override
    public Book viewBookById(Integer id) {
        Optional<Book> opt = bookDao.findById(id);
        Book book = opt.get();
        if (opt.isPresent()) {
            return book;
        }
        return null;
    }

    @Override
    public List<Book> viewAllBook() {
        List<Book> books = bookDao.findAll();
        if (!books.isEmpty()) {
            return books;
        }
        return null;
    }

    @Override
    public List<Book> viewByCategory(String category) {
        List<Book> books = bookDao.findByCategory(category);
        if (!books.isEmpty()) {
            return books;
        }
        return null;
    }

    @Override
    public Book viewByName(String name) {
        Book opt = bookDao.findByBookName(name);
        return opt;
    }

    @Override
    public List<Book> viewByAuthor(String author) {
        List<Book> books = bookDao.findByAuthor(author);
        if (!books.isEmpty()) {
            return books;
        }
        return null;
    }
}
