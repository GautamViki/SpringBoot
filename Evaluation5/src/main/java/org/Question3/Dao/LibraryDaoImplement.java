package org.Question3.Dao;

import org.Question3.Entities.Book;
import org.Question3.Entities.Book_Genre;
import org.Question3.Exception.BookNotFound;
import org.Question3.Exception.GenreNotFound;
import org.Question3.Utility.BookUtil;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

public class LibraryDaoImplement implements LibraryDao{
    @Override
    public boolean addBook(Book book) {
        EntityManager em= BookUtil.provideEntityManager();
        em.getTransaction().begin();
        em.persist(book);
        em.getTransaction().commit();
        em.close();
        System.out.println("Book add....");
        return true;
    }

    @Override
    public boolean addGenre(Book_Genre bookGenre) {
        EntityManager em= BookUtil.provideEntityManager();
        em.getTransaction().begin();
        em.persist(bookGenre);
        em.getTransaction().commit();
        em.close();
        System.out.println("bookGenre add....");
        return true;
    }

    @Override
    public List<Book> getBooksByGenre(String genre) throws GenreNotFound {
        EntityManager em= BookUtil.provideEntityManager();
        String jpql= "from Account where name='Ram'";
        Query q= em.createQuery(jpql);

        List<Book> list= q.getResultList();

        for(Book acc:list){
            System.out.println(acc);
        }
        return list;

    }

    @Override
    public String updateAuthorName(String bookName, String authorName) throws BookNotFound {
        String mes="not update";
        EntityManager em=BookUtil.provideEntityManager();
        Book book=em.find(Book.class,bookName);

       if (book!=null){
           book.setAuthor_name(authorName);
           em.getTransaction().begin();
           em.merge(book);
           em.getTransaction().commit();
           em.close();
           mes="updated...";
       }else {
           throw new BookNotFound("Book not found");
       }

//        System.out.println("Updated......");
        return mes;
    }

    @Override
    public void removeGenre(String genre) throws GenreNotFound {
        EntityManager em= BookUtil.provideEntityManager();
        String mes="not deleted";
        Book_Genre bookGenre=em.find(Book_Genre.class, genre);
        if(bookGenre != null){
            em.getTransaction().begin();
            em.remove(bookGenre);
            em.getTransaction().commit();
            mes="deleted....";
            em.close();
        }
        else {
            throw new GenreNotFound(mes);
        }

    }

    @Override
    public void removeBook(String bookName) throws BookNotFound {
        EntityManager em= BookUtil.provideEntityManager();
        String mes="not deleted";
        Book book=em.find(Book.class, bookName);
        if(book != null){
            em.getTransaction().begin();
            em.remove(book);
            em.getTransaction().commit();
            mes="deleted....";
            em.close();
        }
        else {
            throw new BookNotFound(mes);
        }
    }
}
