package za.co.enimeation.bookstore.management.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity(name = "books_archive")
@Data
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long _id;
    private String _title;
    private String _author;
    private String _genre;
    private String _isbn;
    private double _price;

    public void _setId(Long _id) {
        this._id = _id;
    }
    public Long _getId() {
        return _id;
    }

    public void _setTitle(String _title) {
        this._title = _title;
    }
    public String _getTitle() {
        return _title;
    }

    public void _setAuthor(String _author) {
        this._author = _author;
    }
    public String _getAuthor() {
        return _author;
    }

    public void _setIsbn(String _isbn) {
        this._isbn = _isbn;
    }
    public String _getIsbn() {
        return _isbn;
    }

    public String _getGenre() {
        return _genre;
    }

    public void _setGenre(String _genre) {
        this._genre = _genre;
    }

    public double _getPrice() {
        return  _price;
    }
    public void _setPrice(double _price) {
        this._price = _price;
    }
}
