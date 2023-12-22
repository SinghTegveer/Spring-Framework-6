package com.abbrevatize.springwebapplication.controller;

import com.abbrevatize.springwebapplication.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class BookController {

    @Autowired
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    // Spring registers localhost:8080/books URL as the view
    @RequestMapping("/books")
    public String getBooks(Model model) {
        // Return a key and value attribute
        model.addAttribute("books", bookService.findAll());
        // Telling Spring to look for a view called books - within templates directory
        return "books";
    }
}
