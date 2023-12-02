package be.brahms.models.forms;

import be.brahms.models.entities.Author;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class AuthorF {

    @NotBlank
    private String name;
    @NotBlank
    private String firstname;

    public Author toEntity() {
        return new Author(this.name, this.firstname);
    }
}
