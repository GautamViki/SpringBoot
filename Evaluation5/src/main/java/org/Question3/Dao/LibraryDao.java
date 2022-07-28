package org.Question3.Dao;

import org.Question3.Entities.Book;
import org.Question3.Entities.Book_Genre;
import org.Question3.Exception.BookNotFound;
import org.Question3.Exception.GenreNotFound;

import java.util.List;

public interface LibraryDao {
    boolean addBook(Book book);
    boolean addGenre(Book_Genre bookGenre);
    List<Book> getBooksByGenre(String genre) throws GenreNotFound;
    String updateAuthorName(String bookName, String authorName) throws BookNotFound;
    void removeGenre(String genre) throws GenreNotFound;
    void removeBook(String bookName) throws BookNotFound;
}
