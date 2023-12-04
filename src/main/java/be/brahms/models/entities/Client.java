package be.brahms.models.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor @AllArgsConstructor
@Getter @Setter
@Entity
public class Client {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(unique = true)
    private String niss;
    private String name;
    private String firstname;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "adresse_id", referencedColumnName = "id")
    private Adresse adresse;

    @OneToMany(mappedBy = "client")
    private Set<ClientBook> renteBooks = new HashSet<>();

    public Client(String niss, String name, String firstname, Adresse adresse) {
        this.niss = niss;
        this.name = name;
        this.firstname = firstname;
        this.adresse = adresse;
    }
}
