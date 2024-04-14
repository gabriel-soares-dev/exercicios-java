package one.dio.dnp.gss.controller;

import org.springframework.web.bind.annotation.RestController;

import one.dio.dnp.gss.model.Client;
import one.dio.dnp.gss.service.ClientService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@RequestMapping("clients")
public class ClientRestController {
    
    @Autowired
    private ClientService clientService;

    @GetMapping("/")
    public ResponseEntity<Iterable<Client>> findAll(){
        return ResponseEntity.ok(clientService.findClients());
    }

    @PostMapping("/")
    public ResponseEntity<Client> insertClient(@RequestBody Client client) {
        clientService.insertClient(client);
        return ResponseEntity.ok(client);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Client> findClientById(@PathVariable Long id) {
        return ResponseEntity.ok(clientService.findClientbyId(id));
    }
    @PutMapping("/{id}")
    public ResponseEntity<Client> updateClientById(@PathVariable Long id, @RequestBody Client client) {
        clientService.updateClient(id, client);
        return ResponseEntity.ok(client);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteClientById(@PathVariable Long id) {
        clientService.deleteClient(id);
        return ResponseEntity.ok().build();
    }
    
}
