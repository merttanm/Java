/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

/**
 *
 * @author merttan
 */
public class Book implements Comparable {

    private String title;
    private String authorFName;
    private String authorLName;
    private int pages;

    public Book(String title, String authorFName, String authorLName, int pages) {
        this.title = title;
        this.authorFName = authorFName;
        this.authorLName = authorLName;
        this.pages = pages;
    }
    
    

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthorFName() {
        return authorFName;
    }

    public void setAuthorFName(String authorFName) {
        this.authorFName = authorFName;
    }

    public String getAuthorLName() {
        return authorLName;
    }

    public void setAuthorLName(String authorLName) {
        this.authorLName = authorLName;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public int compareTo(Object o) {
        Book book = (Book) o;
        return title.compareTo(book.getTitle());
    }

    public void printInfo() {
        System.out.println(" *** Book Info *** ");
        System.out.println(this);
    }

    public String toString() {
        return getTitle() + " (" + pages + " pages) " + " Written By: " + getAuthorFName() + " " + getAuthorLName() + "\n";
    }

}
