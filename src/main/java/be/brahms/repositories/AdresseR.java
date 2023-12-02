package be.brahms.repositories;

import be.brahms.models.entities.Adresse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdresseR extends JpaRepository<Adresse, Long> {
}
