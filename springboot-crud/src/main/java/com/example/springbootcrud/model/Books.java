package com.example.springbootcrud.model;

import javax.persistence.*;

@Entity
@Table(name = "books")

public class Books {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bookId;

    @Column
    private String books;

    @Column
    private String author;

    @Column
    private int editions;

    public Books(String books, String author, int editions) {
        this.books = books;
        this.author = author;
        this.editions = editions;
    }

    public Books() {

    }

    public int getBookId() {
        return bookId;
    }

    public void setId(int bookId) {
        this.bookId = bookId;
    }

    public String getBooks() {
        return books;
    }

    public void setBooks(String books) {
        this.books = books;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getEditions() {
        return editions;
    }

    public void setEditions(int editions) {
        this.editions = editions;
    }

}
