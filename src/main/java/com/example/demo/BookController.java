package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping("/welcome")
    public String welcome() {
        return "welcome to spring boot app development";
    }

    @GetMapping(value = "/books")
    public List<Book> getBooks() {
        return bookService.getBooks();
    }

    @PostMapping(value = "/books")
    public String addBook(@RequestBody List<Book> listOfBooks) {
        System.out.println("A list of books was added into database");
        bookService.addBook(listOfBooks);

        return "A list of books was added into database";
    }

    @DeleteMapping("/delete-books")
    public String deleteBook(@RequestBody Book book) {
        bookService.delete(book);
        return "Book was deleted from database";
    }

    @PutMapping("/update-name")
    public String updateBookNameByName(@RequestParam String oldName, @RequestParam String newName) {
        bookService.updateBookNameByName(oldName, newName);
        return "Book was updated by name";
    }

    @PutMapping("/update-book")
    public String updateBook(@RequestBody Book newBook, @RequestParam String nume) {
        bookService.updateBookByName(newBook, nume);
        return "Book was updated by name";
    }
}
