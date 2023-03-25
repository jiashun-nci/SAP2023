package com.ncirl.insecure.controller;
import java.security.Principal;
import java.util.List;

import com.ncirl.insecure.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;
import com.ncirl.insecure.service.BookService;

@RestController
public class BookController {
    @Autowired
    BookService bookService;

    @GetMapping("/book")
    private List<Book> getAllBook()
    {
        return bookService.getAllBook();
    }
    //creating a get mapping that retrieves the detail of a specific book
    @GetMapping("/book/{id}")
    private Book getBook(@PathVariable("id") int id)
    {
        return bookService.getBookById(id);
    }
    //creating a delete mapping that deletes a specific book
    @DeleteMapping("/book/{id}")
    private void deleteBook(@PathVariable("id") int id)
    {
        bookService.delete(id);
    }
    //creating post mapping that post the book detail in the database
    @PostMapping("/book")
    private int saveBook(@RequestBody Book book)
    {
        bookService.saveOrUpdate(book);
        return book.getId();
    }

    @RequestMapping("/")
    public String test(Principal principal) {
        return "Welcomer to Library!";
    }

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("/books")
    public List<Book> getBooks(@RequestParam("title") String title) {
        String sql = "SELECT * FROM books WHERE title = '" + title + "'";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Book.class));
    }
}
