package be.brahms.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Book extends JpaRepository<Book, Long> {
}
