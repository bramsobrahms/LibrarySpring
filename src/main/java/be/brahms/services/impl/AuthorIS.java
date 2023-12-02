package be.brahms.services.impl;

import be.brahms.models.entities.Author;
import be.brahms.repositories.AuthorR;
import be.brahms.services.AuthorS;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorIS implements AuthorS {

    private final AuthorR authorRepo;

    public AuthorIS(AuthorR authorRepo) {
        this.authorRepo = authorRepo;
    }

    @Override
    public Author registreAuthor(Author author) {
        return authorRepo.save(author);
    }

    @Override
    public Author findAuthorById(Long id) {
        return null;
    }

    @Override
    public Author updateAuthor(Long id, Author author) {
        return null;
    }

    @Override
    public List<Author> searchAuthor(Author author) {
        return null;
    }

    @Override
    public void deleteAuthor(Long id) {

    }
}
