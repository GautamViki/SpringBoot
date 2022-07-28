package org.Question3.UsesCases;

import org.Question3.Dao.LibraryDao;
import org.Question3.Dao.LibraryDaoImplement;
import org.Question3.Exception.BookNotFound;

import java.util.Scanner;

public class RemoveBook extends BookNotFound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Book name");
        String name = sc.next();


        LibraryDao dao = new LibraryDaoImplement();
        try {
            dao.removeBook(name);
        } catch (BookNotFound e) {
            System.out.println(e.getMessage());
        }
    }
}
