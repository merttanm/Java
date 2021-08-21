/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Library;

import LibraryHW.Author;
import LibraryHW.Book;
import LibraryHW.Reader;

/**
 *
 * @author MERT
 */
public class Test {

    public static void main(String[] args) {

        Author authorR= new Author();
        authorR.authorName="Zülfü";
        authorR.authorSurname="Lİvaneli";
        
        
        Book book= new Book();
        book.bookName="Seranad";
        book.bookPage=123;
        book.bookType="make a cover";
        
        Reader readerR= new Reader();
        readerR.name="Jale";
        
        authorR.book=book;
        authorR.book= new Book();
        authorR.book=book;
        
        readerR.bookName=book;
        readerR.bookName= new Book();
        readerR.bookName=book;
        
        
        System.out.println("Yazarın kitab bilgileri: " +" | "+authorR.book.bookName +" | "+authorR.book.bookType+" | "+authorR.book.bookPage);
        
        System.out.println("Okuyucunun aldığı kitap bilgileri: " +" | "+readerR.bookName.bookName );

        

    }

}
