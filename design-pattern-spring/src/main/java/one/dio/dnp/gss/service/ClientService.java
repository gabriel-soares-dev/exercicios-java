package one.dio.dnp.gss.service;

import one.dio.dnp.gss.model.Client;

public interface ClientService {
    
    Iterable<Client> findClients();
    Client findClientbyId(Long id);
    void insertClient(Client client);
    void updateClient(Long id,Client client);
    void deleteClient(Long id);
}
