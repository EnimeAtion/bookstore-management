package za.co.enimeation.bookstore.management.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.co.enimeation.bookstore.management.model.Book;
import za.co.enimeation.bookstore.management.repository.BookRepository;

import java.util.Collections;
import java.util.List;

@Service
public class BookService {
    private final BookRepository _bookRepo;

    @Autowired
    public BookService(BookRepository _bookRepo) {
        this._bookRepo = _bookRepo;
    }

    public Iterable<Book> _getAllBooks() {
        return _bookRepo.findAll();
    }
    public Book _getBook(Long _id) {
        return _bookRepo.findById(_id).orElse(null);
    }
    public Book _saveBook(Book _book) {
        return _bookRepo.save(_book);
    }
    public void _deleteBook(Long _id) {
        _bookRepo.deleteById(_id);
    }
    public Book _updateBook(Long _id, Book _updatedData) {

        return _bookRepo.findById(_id)
                .map(book -> {
                    book._setTitle(_updatedData._getTitle());
                    book._setAuthor(_updatedData._getAuthor());
                    book._setIsbn(_updatedData._getIsbn());
                    book._setGenre(_updatedData._getGenre());

                    return _bookRepo.save(book);
                }).orElseGet(() -> {
                    _updatedData._setId(_id);

                    return _bookRepo.save(_updatedData);
                }
                );
    }

//    public List<Book> _searchBook(String keyword) {
//        return _bookRepo.search("%" + keyword + "%");
//    }
}
