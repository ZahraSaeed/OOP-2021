package com.company;

public class Book {
    private Person author;
    private String book_name;
    private String publisher;

    public Book(){
    }
    public Book(Person author, String bookname, String publisher){
        this.author = author;
        this.book_name = bookname;
        this.publisher = publisher;
    }
    public void setAuthor(Person author) {
        this.author = author;
    }
    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public void display(){
        System.out.println("Book name: " + book_name + "\nBook publisher: " + publisher);
        author.display();
    }
}
