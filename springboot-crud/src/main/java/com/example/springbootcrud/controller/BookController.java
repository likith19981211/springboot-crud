package com.example.springbootcrud.controller;

import com.example.springbootcrud.model.Books;
import com.example.springbootcrud.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    BooksService booksService;

    @GetMapping("/books")
    private List<Books> getAllBooks(){
        return booksService.getAllBooks();
    }

    @GetMapping("/books/{bookId}")
    private Books getBooks(@PathVariable("bookId") int bookId){
        return booksService.getBooksById(bookId);
    }
    @DeleteMapping("/books/{bookId}")
    public void deleteBook(@PathVariable("bookId") int bookId) {
        booksService.delete(bookId);
    }
    @PostMapping("/books")
    private int saveBook(@RequestBody Books books) {
        booksService.saveOrUpdate(books);
        return books.getBookId();
    }

    @PutMapping("/books")
    private Books update(@RequestBody Books books)
    {
        booksService.saveOrUpdate(books);
        return books;
    }

}
