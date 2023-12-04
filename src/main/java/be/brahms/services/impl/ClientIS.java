package be.brahms.services.impl;

import be.brahms.models.entities.Client;
import be.brahms.repositories.ClientR;
import be.brahms.services.ClientS;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientIS implements ClientS {

    private final ClientR clientRepo;

    public ClientIS(ClientR clientRepo){
        this.clientRepo = clientRepo;
    }

    @Override
    public Client registryClient(Client client) {
        return clientRepo.save(client);
    }

    @Override
    public Client clientById(Long id) {
        return null;
    }

    @Override
    public List<Client> allClients() {
        return null;
    }

    @Override
    public Client updateClient(Long id, Client client) {
        return null;
    }

    @Override
    public void deleteclient() {

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
