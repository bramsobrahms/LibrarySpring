package be.brahms.models.forms;

import be.brahms.models.entities.Adresse;
import be.brahms.models.entities.Client;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class ClientF {

    @Size(min = 11, max = 15)
    private String niss;
    private String name;
    private String firstname;

    private String street;
    private String number;
    private String zipcode;
    private String city;

    public Client toEntity(){
        return new Client(this.niss, this.name, this.firstname, new Adresse(this.street, this.number, this.zipcode, this.city));
    }
}
