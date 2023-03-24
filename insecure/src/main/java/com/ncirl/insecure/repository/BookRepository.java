package com.ncirl.insecure.repository;
import com.ncirl.insecure.model.Book;
import org.springframework.data.repository.CrudRepository;
public interface BookRepository extends CrudRepository<Book, Integer>{
}
