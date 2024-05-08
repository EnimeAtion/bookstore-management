package za.co.enimeation.bookstore.management.controller;

import jakarta.validation.Valid;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;
import za.co.enimeation.bookstore.management.authentication.JwtAuthenticationResponse;
import za.co.enimeation.bookstore.management.authentication.LoginRequest;
import za.co.enimeation.bookstore.management.authentication.TokenProvider;
import za.co.enimeation.bookstore.management.authentication.User;
import za.co.enimeation.bookstore.management.model.Book;
import za.co.enimeation.bookstore.management.service.BookService;

import java.util.List;

@RestController
public class BookController {
    private final BookService _bookService;

    @Autowired
    public BookController(BookService _bookService) {
        this._bookService = _bookService;
    }

    @PostMapping("/login")
    public ResponseEntity<?> authenticateUser(@Valid @RequestBody LoginRequest loginRequest) {
        new User("given", "admin");
        AuthenticationManager authenticationManager = null;
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        loginRequest.getUsername(),
                        loginRequest.getPassword()
                )
        );

        TokenProvider tokenProvider = new TokenProvider();

        SecurityContextHolder.getContext().setAuthentication(authentication);
        String jwt = tokenProvider.generateToken(authentication);
        return ResponseEntity.ok(new JwtAuthenticationResponse(jwt));
    }
    @GetMapping("/book/all")
    public Iterable<Book> _getBooks() {
        return _bookService._getAllBooks();
    }
    @GetMapping("/book/{id}")
    public Book _getBook(@PathVariable Long _id) {
        return _bookService._getBook(_id);
    }
    @GetMapping("/book/deleted/{id}")
    public void _deleteBook(@PathVariable Long _id) {
        _bookService._deleteBook(_id);
    }
    @PostMapping("/book/add")
    public Book _saveBook(@RequestBody Book _book) {
        return _bookService._saveBook(_book);
    }

//    @GetMapping("/book/search/results")
//    public List<Book> _searchResults( String key) {
//        return _bookService._searchBook(key);
//    }
    @GetMapping("/book/update/{id}")
    public Book _updateBook(@PathVariable Long _id, @RequestBody Book _book) {
        return _bookService._updateBook(_id, _book);
    }
}
