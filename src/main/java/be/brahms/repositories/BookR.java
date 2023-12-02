package be.brahms.repositories;

import be.brahms.models.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookR extends JpaRepository<Book, Long> {
}
