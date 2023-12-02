package be.brahms.models.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Data
@NoArgsConstructor @AllArgsConstructor
@Getter @Setter
@Entity
public class ClientBook {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private LocalDate rentAt;
    private LocalDate backAt;
    boolean backBook;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;
    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;

}
