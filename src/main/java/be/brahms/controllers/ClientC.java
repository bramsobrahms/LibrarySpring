package be.brahms.controllers;

import be.brahms.models.entities.Client;
import be.brahms.models.forms.ClientF;
import be.brahms.services.ClientS;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
