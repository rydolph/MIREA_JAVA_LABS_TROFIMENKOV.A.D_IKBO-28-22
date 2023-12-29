package ru.mirea.lab1;

import java.lang.*;
public class Book {
    private int cPage;
    private String bookName;
    public Book(String n, int a){
        bookName = n;
        cPage = a;
    }
    public Book(String n){
        bookName = n;
        cPage = 0;
    }
    public Book(){
        bookName = "WW2";
        cPage = 0;
    }

    public void setcPage(int cPage) {
        this.cPage = cPage;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookName() {
        return bookName;
    }

    public int getcPage() {
        return cPage;
    }

    public String toString() {
        return this.bookName+" has "+cPage+" pages";
    }
}
