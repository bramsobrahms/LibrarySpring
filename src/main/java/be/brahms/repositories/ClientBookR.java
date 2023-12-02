package be.brahms.repositories;

import be.brahms.models.entities.ClientBook;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientBookR extends JpaRepository<ClientBook, Long> {
}
