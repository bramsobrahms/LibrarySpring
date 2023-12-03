package be.brahms.services.impl;

import be.brahms.exceptions.authorE.NotFoundAuthorEx;
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
        return authorRepo.findById(id).orElseThrow(NotFoundAuthorEx::new);
    }

    @Override
    public List<Author> findAllAuthors() {
        return authorRepo.findAll();
    }

    @Override
    public Author updateAuthor(Long id, Author author) {
        Author updateAuthor = authorRepo.findById(id).orElseThrow(NotFoundAuthorEx::new);
        updateAuthor.setName(author.getName());
        updateAuthor.setFirstname(author.getFirstname());
        return authorRepo.save(updateAuthor);
    }

    @Override
    public List<Author> searchAuthor(String searchByNameOrFirstname) {
        return authorRepo.searchAuthorByNameAndFirstname(searchByNameOrFirstname);
    }

    @Override
    public void deleteAuthor(Long id) {

    }
}
