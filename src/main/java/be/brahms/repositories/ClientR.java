package be.brahms.repositories;

import be.brahms.models.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientR extends JpaRepository<Client, Long> {
}
