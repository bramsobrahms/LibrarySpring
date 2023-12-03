package be.brahms.repositories;

import be.brahms.models.entities.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AuthorR extends JpaRepository<Author, Long> {

    @Query("SELECT a FROM Author a WHERE a.name = :nameFirstname OR a.firstname = :nameFirstname ")
    List<Author> searchAuthorByNameAndFirstname(@Param("nameFirstname") String searchByNameOrFirstname);
}
