package be.brahms.controllers;

import be.brahms.models.entities.Author;
import be.brahms.models.forms.AuthorF;
import be.brahms.services.AuthorS;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/author")
public class AuthorC {

    private final AuthorS authorServ;

    public AuthorC(AuthorS authorServ) {
        this.authorServ = authorServ;
    }

    @PostMapping("/registre")
    public ResponseEntity<Author> registreAuthor(@RequestBody @Valid AuthorF form) {
        Author newAuthor = authorServ.registreAuthor(form.toEntity());
        return ResponseEntity.ok(newAuthor);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Author> findAuthorById (@PathVariable Long id) {
        Author findAuthor = authorServ.findAuthorById(id);
        return ResponseEntity.ok(findAuthor);
    }
}
