package be.brahms.models.dtos;

import be.brahms.models.entities.Author;

public record AuthorDTO(
        Long id,
        String name,
        String firstname
) {
    public static AuthorDTO fromEntity(Author author){
        return new AuthorDTO(author.getId(), author.getName(), author.getFirstname());
    }
}
