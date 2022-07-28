package org.Question3.UsesCases;

import org.Question3.Dao.LibraryDao;
import org.Question3.Dao.LibraryDaoImplement;
import org.Question3.Entities.Book;

import javax.xml.crypto.Data;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class AddBook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Book name");
        String name = sc.next();
        System.out.println("Auther name");
        String aNAme = sc.next();
        System.out.println("Date publish dd/MM/yyyy");
        String date = sc.next();

        Date date1 = null;
        try {
            date1 = new SimpleDateFormat("dd/MM/yyyy").parse(date);
        } catch (ParseException e) {
            System.out.println(e.getMessage());
            ;
        }
        Book book = new Book();
        book.setBook_name(name);
        book.setAuthor_name(aNAme);
        book.setPublished_date(date1);
        LibraryDao dao = new LibraryDaoImplement();
        Boolean flag = dao.addBook(book);
        System.out.println(flag);
    }
}
