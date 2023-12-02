package be.brahms.models.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Data
@NoArgsConstructor @AllArgsConstructor
@Getter @Setter
@Entity
public class Author {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String firstname;

    @ManyToMany(mappedBy = "authors")
    private Set<Book> books;
}
