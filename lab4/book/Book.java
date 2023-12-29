package ru.mirea.lab4.book;

public class Book {
    private String name;
    private String Author;
    private int year;
    private int lists;

    public Book(){}

    public Book(String name, String Author, int year, int lists){
        this.name = name;
        this.Author = Author;
        this.year = year;
        this.lists = lists;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLists(int lists) {
        this.lists = lists;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return Author;
    }

    public int getYear() {
        return year;
    }

    public int getLists() {
        return lists;
    }

    @Override
    public String toString() {
        return "Книга - "+name+"\nАвтор книги - "+Author+"\nГод написания - "+year+"\nКол-во страниц -"+lists;
    }
}
