package be.brahms.services;

import be.brahms.models.entities.Adresse;
import be.brahms.models.entities.Client;

import java.util.List;

public interface ClientS {

    Client registryClient(Client client);
    Client clientById(Long id);
    List<Client> allClients();
    Client updateClient(Long id, Client client);
    void deleteclient();
    Client searchByNiss(String niss);
    List<Client> searchByname(String name);
}
