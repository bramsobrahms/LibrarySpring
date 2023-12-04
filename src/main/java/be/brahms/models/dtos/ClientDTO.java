package be.brahms.models.dtos;

import be.brahms.models.entities.Client;

public record ClientDTO(
        String niss,
        String name,
        String firstname,
        String street,
        String number,
        String zipcode,
        String city
) {
    public static ClientDTO fromEntity(Client client) {
        return new ClientDTO(client.getNiss(), client.getName(), client.getFirstname(), client.getAdresse().getStreet(), client.getAdresse().getNumber(), client.getAdresse().getZipcode(), client.getAdresse().getCity());
    }
}
