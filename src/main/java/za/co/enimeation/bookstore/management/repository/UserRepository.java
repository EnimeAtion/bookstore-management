package za.co.enimeation.bookstore.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import za.co.enimeation.bookstore.management.model.Book;
import za.co.enimeation.bookstore.management.model.User;

public interface UserRepository extends JpaRepository<Book, Long> {
}
