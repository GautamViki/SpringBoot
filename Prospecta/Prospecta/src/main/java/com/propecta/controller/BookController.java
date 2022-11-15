package com.propecta.controller;

import com.propecta.entity.Book;
import com.propecta.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookService bookService;

    @PostMapping("/")
    public Book createBook(@RequestBody Book book) {
        return bookService.addBook(book);
    }

    @GetMapping("/{id}")
    public Book viewById(@PathVariable Integer id) {
        return bookService.viewBookById(id);
    }

    @GetMapping("/")
    public List<Book> viewAllBook() {
        return bookService.viewAllBook();
    }

    @GetMapping("/category/{cat}")
    public List<Book> viewByCategory(@PathVariable String cat) {
        return bookService.viewByCategory(cat);
    }

    @GetMapping("/title/{title}")
    public Book viewByTitle(@PathVariable String title) {
        return bookService.viewByName(title);
    }

    @GetMapping("/author/{author}")
    public List<Book> viewByAuthor(@PathVariable String author) {
        return bookService.viewByAuthor(author);
    }
}
