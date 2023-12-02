package be.brahms.repositories;

import be.brahms.models.entities.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorR extends JpaRepository<Author, Long> {
}
