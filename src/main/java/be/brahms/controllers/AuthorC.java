package be.brahms.controllers;

import be.brahms.models.dtos.AuthorDTO;
import be.brahms.models.entities.Author;
import be.brahms.models.forms.AuthorF;
import be.brahms.services.AuthorS;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "/author")
public class AuthorC {

    private final AuthorS authorServ;

    public AuthorC(AuthorS authorServ) {
        this.authorServ = authorServ;
    }

    @PostMapping(value = "/registry")
    public ResponseEntity<Author> registryAuthor(@RequestBody @Valid AuthorF form) {
        Author newAuthor = authorServ.registreAuthor(form.toEntity());
        return ResponseEntity.ok(newAuthor);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Author> findAuthorById(@PathVariable Long id) {
        Author findAuthor = authorServ.findAuthorById(id);
        return ResponseEntity.ok(findAuthor);
    }

    @GetMapping(value = "")
    public ResponseEntity<List<Author>> findAllAuthors(){
        List<Author> listAuthors = authorServ.findAllAuthors();
        return ResponseEntity.ok(listAuthors);
    }

    @PutMapping(value = "/{id}/update")
    public ResponseEntity<AuthorDTO> updateAuthor(@PathVariable Long id, @RequestBody AuthorF form) {
        Author updateAuthor = authorServ.updateAuthor(id, form.toEntity());
        return ResponseEntity.ok(AuthorDTO.fromEntity(updateAuthor));
    }

    @GetMapping(value = "/search/{nameOrFirstname}")
    public ResponseEntity<List<Author>> searchAuthor(@PathVariable String nameOrFirstname) {
        List<Author> searchByAuthor = authorServ.searchAuthor(nameOrFirstname);
        return ResponseEntity.ok(searchByAuthor);
    }

    @DeleteMapping(value = "/{id}/delete")
    public ResponseEntity<String> deleteAuthor(@PathVariable Long id){
        authorServ.deleteAuthor(id);
        return ResponseEntity.status(200).body("Deletion success");
    }

}
