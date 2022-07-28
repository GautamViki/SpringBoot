package org.Question3.Entities;
import javax.persistence.*;
import java.util.Date;
@Entity
public class Book {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int book_id;
    private String book_name;
    private  String author_name;
    private Date published_date;

    public Book(){}

    public Book(int book_id, String book_name, String author_name, Date published_date) {
        this.book_id = book_id;
        this.book_name = book_name;
        this.author_name = author_name;
        this.published_date = published_date;
    }

    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public String getAuthor_name() {
        return author_name;
    }

    public void setAuthor_name(String author_name) {
        this.author_name = author_name;
    }

    public Date getPublished_date() {
        return published_date;
    }

    public void setPublished_date(Date published_date) {
        this.published_date = published_date;
    }
}
