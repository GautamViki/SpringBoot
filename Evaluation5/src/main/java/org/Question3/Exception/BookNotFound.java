package org.Question3.Exception;

public class BookNotFound extends Exception {
    public BookNotFound(){

    }
    public BookNotFound(String message){
        super(message);
    }
}
