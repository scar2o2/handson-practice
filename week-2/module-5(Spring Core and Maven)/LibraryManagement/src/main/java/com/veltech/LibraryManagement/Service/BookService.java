package com.veltech.LibraryManagement.Service;

import com.veltech.LibraryManagement.Repository.BookRepository;

public class BookService {
    private BookRepository repository;
    public void setRepository(BookRepository repository) {
        this.repository = repository;
    }
    public void displayBooks() {
        System.out.println("Available Books:");
        for (String book : repository.getBooks()) {
            System.out.println(book);
        }
    }
}