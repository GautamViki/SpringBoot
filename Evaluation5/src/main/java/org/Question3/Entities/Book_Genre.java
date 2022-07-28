package org.Question3.Entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Entity
public class Book_Genre {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private  int genre_id;
    private  String genre_name;

    @OneToMany(cascade= CascadeType.ALL)
    private List<Book> emp=new ArrayList<>();

    public Book_Genre(){

    }

    public Book_Genre(int genre_id, String genre_name, List<Book> emp) {
        this.genre_id = genre_id;
        this.genre_name = genre_name;
        this.emp = emp;
    }

    public int getGenre_id() {
        return genre_id;
    }

    public void setGenre_id(int genre_id) {
        this.genre_id = genre_id;
    }

    public String getGenre_name() {
        return genre_name;
    }

    public void setGenre_name(String genre_name) {
        this.genre_name = genre_name;
    }

    public List<Book> getEmp() {
        return emp;
    }

    public void setEmp(List<Book> emp) {
        this.emp = emp;
    }
}
