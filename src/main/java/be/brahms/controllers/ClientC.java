package be.brahms.controllers;

import be.brahms.models.dtos.ClientDTO;
import be.brahms.models.entities.Client;
import be.brahms.models.forms.ClientF;
import be.brahms.services.ClientS;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/client")
public class ClientC {

    private final ClientS clientServ;

    public ClientC(ClientS clientServ) {
        this.clientServ = clientServ;
    }

    @PostMapping(value = "/registry")
    public ResponseEntity<Client> registryClient(@RequestBody @Valid ClientF form){
        Client newClient = clientServ.registryClient(form.toEntity());
        return ResponseEntity.ok(newClient);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Client> findClientById(@PathVariable Long id){
        Client findByIdClient = clientServ.clientById(id);
        return ResponseEntity.ok(findByIdClient);
    }

    @GetMapping(value = "")
    public ResponseEntity<List<Client>> findAllClients(){
        List<Client> listClients = clientServ.allClients();
        return ResponseEntity.ok(listClients);
    }

    @PutMapping(value = "/update/{id}")
    public ResponseEntity<ClientDTO> updateClient(@PathVariable Long id, @RequestBody ClientF form){
        Client updateClient = clientServ.updateClient(id, form.toEntity());
        return ResponseEntity.ok(ClientDTO.fromEntity(updateClient));
    }

    @PutMapping(value = "/{niss}/update")
    public ResponseEntity<ClientDTO> updateClientNiss(@PathVariable String niss, @RequestBody ClientF form){
        Client updateClientNiss = clientServ.updateClientNiss(niss, form.toEntity());
        return ResponseEntity.ok(ClientDTO.fromEntity(updateClientNiss));
    }

}
