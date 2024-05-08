package za.co.enimeation.bookstore.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.enimeation.bookstore.management.model.Book;
public interface OrderRepository extends JpaRepository<Book, Long> {
}
