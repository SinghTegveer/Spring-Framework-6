package com.abbrevatize.springwebapplication.service;

import com.abbrevatize.springwebapplication.domain.Book;

// This is an interface as in a common scenario we can have multiple implementations of a service method
public interface BookService {
    Iterable<Book> findAll();
}
