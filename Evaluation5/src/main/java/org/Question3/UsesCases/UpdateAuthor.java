package org.Question3.UsesCases;

import org.Question3.Dao.LibraryDao;
import org.Question3.Dao.LibraryDaoImplement;
import org.Question3.Exception.BookNotFound;

import java.util.Scanner;

public class UpdateAuthor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Book name");
        String bName=sc.next();
        System.out.println("Author name");
        String aName=sc.next();

        try {
            LibraryDao dao = new LibraryDaoImplement();
            String flag = dao.updateAuthorName(bName,aName);
            System.out.println(flag);
        }catch (BookNotFound e){
            System.out.println(e.getMessage());
        }

    }
}
