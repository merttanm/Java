/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibraryHW;

/**
 *
 * @author MERT
 */
public class TestLibrary {

    public static void main(String[] args) {

        Author authorR= new Author();
        authorR.authorName="Zülfü";
        authorR.authorSurname="Lİvaneli";
        
        
        Book bookK= new Book();
        bookK.bookName="Seranad";
        bookK.bookPage=123;
        bookK.bookType="make a cover";
        
        Reader readerR= new Reader();
        readerR.name="Jale";
        
        authorR.bookName=bookK;
        authorR.bookName= new Book();
        authorR.bookName=bookK;
        
        readerR.bookName=bookK;
        readerR.bookName= new Book();
        readerR.bookName=bookK;
        
        
        System.out.println("Yazarın kitab bilgileri: " +" | "+authorR.bookName.bookName +" | "+authorR.bookName.bookType+" | "+authorR.bookName.bookPage);
        
        System.out.println("Okuyucunun aldığı kitap bilgileri: " +" | "+readerR.bookName.bookName );

        

    }

}
