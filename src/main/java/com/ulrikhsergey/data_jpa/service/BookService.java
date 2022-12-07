package com.ulrikhsergey.data_jpa.service;





import com.ulrikhsergey.data_jpa.entity.Book;

import java.util.List;

public interface BookService {

    public List<Book> getAllBooks();

    public void saveBook(Book book);

    public void deleteBook(int id);

    public Book getBook(int id);
}
