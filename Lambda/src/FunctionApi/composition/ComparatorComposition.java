/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FunctionApi.composition;

import Domain.Book;
import Domain.BookFactory;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author merttan
 */
public class ComparatorComposition {

    public static void main(String... args) {
        List<Book> books = init();
        System.out.println("---------- Kitap Listesi ----------");
        books.forEach(book -> System.out.print(book));

        System.out.println("\n---------- Alfabetik Kitap Listesi ----------");
        Collections.sort(books);
        books.forEach(book -> System.out.print(book));
        System.out.println("\n---------- Sayfa Sayısına Göre Kitap Listesi ----------");
        Comparator<Book> maxPage = (b1, b2) -> b1.getPages() - b2.getPages();
        Collections.sort(books, maxPage);
        for (Book b : books) {
            System.out.print(b);
        }
        System.out.println("\n---------- Yazar İsmine Göre Kitap Listesi ----------");
        
        Comparator<Book> pageWriterName= (p1, p2)-> p1.getAuthorFName().compareTo(p2.getAuthorFName());
        Collections.sort(books, pageWriterName);
        for(Book b: books){
            System.out.print(b);
        }
         System.out.println("\n---------- Yazar Soyadına Göre Kitap Listesi ----------");
        
        Comparator<Book> pageWriterSurname= (p1, p2)-> p1.getAuthorLName().compareTo(p2.getAuthorLName());
        Collections.sort(books, pageWriterSurname);
        for(Book b: books){
            System.out.print(b);
        }
        
    }

    private static List<Book> init() {

        return BookFactory.getBookList();
    }

}
