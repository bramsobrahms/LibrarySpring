package be.brahms.services.impl;

import be.brahms.models.entities.Adresse;
import be.brahms.models.entities.Client;
import be.brahms.repositories.AdresseR;
import be.brahms.repositories.ClientR;
import be.brahms.services.ClientS;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientIS implements ClientS {

    private final ClientR clientRepo;
    private final AdresseR adresseRepo;

    public ClientIS(ClientR clientRepo, AdresseR adresseRepo){
        this.clientRepo = clientRepo;
        this.adresseRepo = adresseRepo;
    }

    @Override
    public Client registryClient(Client client) {
        return clientRepo.save(client);
    }

    @Override
    public Client clientById(Long id) {
        return clientRepo.findById(id).orElseThrow();
    }

    @Override
    public List<Client> allClients() {
        return clientRepo.findAll();
    }

    private Client getClient(Client client, Client updateClient) {
        Adresse updateAdresse = adresseRepo.findById(updateClient.getAdresse().getId()).orElseThrow(()-> new EntityNotFoundException("Adress doesnt exist"));

        updateClient.setNiss(client.getNiss());
        updateClient.setName(client.getName());
        updateClient.setFirstname(client.getFirstname());

        updateAdresse.setStreet(client.getAdresse().getStreet());
        updateAdresse.setNumber(client.getAdresse().getNumber());
        updateAdresse.setZipcode(client.getAdresse().getZipcode());
        updateAdresse.setCity(client.getAdresse().getCity());

        updateClient.setAdresse(updateAdresse);

        return clientRepo.save(updateClient);
    }

    @Override
    public Client updateClient(Long id, Client client) {
        Client updateClient = clientRepo.findById(id).orElseThrow();
        return getClient(client, updateClient);
    }

    @Override
    public Client updateClientNiss(String niss, Client client) {
        //TODO repository clientNiss
        //Client updateClient = clientRepo;
        return null;
    }

    @Override
    public void deleteclient(Long id) {
        clientRepo.deleteById(id);
    }

    @Override
    public Client searchByNiss(String niss) {
        return null;
    }

    @Override
    public List<Client> searchByname(String name) {
        return null;
    }
}
