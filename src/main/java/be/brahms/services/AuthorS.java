package be.brahms.services;

import be.brahms.models.entities.Author;

import java.util.List;

public interface AuthorS {

    Author registreAuthor(Author author);
    Author findAuthorById(Long id);
    List<Author> findAllAuthors();
    Author updateAuthor(Long id, Author author);
    List<Author> searchAuthor(String searchByNameOrFirstname);
    void deleteAuthor(Long id);
}
