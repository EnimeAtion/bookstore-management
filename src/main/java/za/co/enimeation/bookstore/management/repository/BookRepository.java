package za.co.enimeation.bookstore.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.enimeation.bookstore.management.model.Book;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {
//    @Query("{ '$or' : [ { 'title' : { $regex: ?0, $options: 'i' } }, { 'author' : { $regex: ?0, $options: 'i' } }, { 'isbn' : { $regex: ?0, $options: 'i' } }, { 'genre' : { $regex: ?0, $options: 'i' } } ] }")
//    List<Book> search(String keyword);
}

