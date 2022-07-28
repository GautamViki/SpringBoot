package org.Question3.UsesCases;

import org.Question3.Dao.LibraryDao;
import org.Question3.Dao.LibraryDaoImplement;
import org.Question3.Exception.BookNotFound;
import org.Question3.Exception.GenreNotFound;

import java.util.Scanner;

public class RemoveGenre extends GenreNotFound {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter genre");
        String genre=sc.next();

        LibraryDao dao = new LibraryDaoImplement();
        try {
            dao.removeGenre(genre);
        } catch (GenreNotFound e) {
            System.out.println(e.getMessage());
        }
    }
}
