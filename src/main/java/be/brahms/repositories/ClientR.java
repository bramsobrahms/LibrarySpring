package be.brahms.repositories;

import be.brahms.models.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientR extends JpaRepository<Client, Long> {
}
