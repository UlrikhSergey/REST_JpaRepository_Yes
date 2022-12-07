package com.ulrikhsergey.data_jpa.service;



import com.ulrikhsergey.data_jpa.dao.BookRepository;
import com.ulrikhsergey.data_jpa.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService{
    @Autowired
    private BookRepository bookRepository;

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public Book getBook(int id) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        Book book = optionalBook.get();
        return book;
    }

    @Override
    public void saveBook(Book book) {
        bookRepository.save(book);
    }

    @Override
    public void deleteBook(int id) {
        bookRepository.deleteById(id);
    }
}
