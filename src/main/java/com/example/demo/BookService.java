package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {

    List<Book> books = new ArrayList<>();
    public List<Book> getBooks() {
        return books;
    }

    public void addBook(List<Book> listOfBooks) {
        for (Book book : listOfBooks) {
            books.add(book);
        }
    }

    public void delete(Book book) {
//        books.removeIf(book1 -> Objects.equals(book1.getNume(), book.getNume()));
        for (Book book1 : books) {
            if(book1.getName().equals(book.getName())) {
                books.remove(book1);
            }

        }
    }

    public void updateBookNameByName(String oldName, String newName) {
        int count = 0;
        for (Book book : books) {
            if (book.getName().equals(oldName)) {
                if (count == 0)
                    continue;
                book.setName(newName);
            }
        }
    }
    public void updateBookByName(Book newBook, String nume) {
        for (Book book : books) {
            if (book.getName().equals(nume)) {
                book.setName(newBook.getName());
                book.setEditura(newBook.getEditura());
                book.setAuthor(newBook.getAuthor());
                book.setPrice(newBook.getPrice());
            }


        }
    }
}
