/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Library;

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
        
        Reader reader= new Reader();
        reader.name="Jale";
        
        authorR.book=book;
        authorR.book= new Book();
        authorR.book=book;
        
        System.out.println("Yazarın kitab bilgileri: " +" | "+authorR.book.bookName +" | "+authorR.book.bookType+" | "+authorR.book.bookPage);
        
       
        

    }

}
