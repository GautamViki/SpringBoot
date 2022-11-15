package com.bookapi.restbook.controller;

import com.bookapi.restbook.model.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
    @GetMapping("books")
    public String getBook() {
        Book book = new Book(124, "abc", "xyz");
        return "hello book vikas" + book;
    }
}
