package com.ncirl.insecure.service;

import com.ncirl.insecure.repository.BookRepository;
import com.ncirl.insecure.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {

    @Autowired
    BookRepository bookRepository;

    public List<Book>  getAllBook() {
        List<Book> books = new ArrayList<Book>();
        bookRepository.findAll().forEach(book -> books.add(book));
        return books;
    }
    public Book getBookById(int id)
    {
        return bookRepository.findById(id).get();
    }
    public void saveOrUpdate(Book book)
    {
        bookRepository.save(book);
    }
    //deleting a specific record
    public void delete(int id)
    {
        bookRepository.deleteById(id);
    }


}
