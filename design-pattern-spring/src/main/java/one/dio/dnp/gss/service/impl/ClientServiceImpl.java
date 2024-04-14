package one.dio.dnp.gss.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import one.dio.dnp.gss.model.Client;
import one.dio.dnp.gss.model.Endereco;
import one.dio.dnp.gss.model.respository.ClientRepository;
import one.dio.dnp.gss.model.respository.EnderecoRepository;
import one.dio.dnp.gss.service.ClientService;
import one.dio.dnp.gss.service.ViaCepService;

@Service
public class ClientServiceImpl implements ClientService{

    //Singleton
    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private EnderecoRepository enderecoRepository;

    @Autowired
    private ViaCepService viaCepService;

    @Override
    public Iterable<Client> findClients() {
     return clientRepository.findAll();    
    }

    @Override
    public Client findClientbyId(Long id) {
     Optional<Client> client = clientRepository.findById(id);
     return client.get();    
    }

    @SuppressWarnings("unused")
    @Override
    public void insertClient(Client client) {
        saveClientWithCep(client);
    }

    @Override
    public void updateClient(Long id, Client client) {
        Optional<Client> clientBd = clientRepository.findById(id);
        if (clientBd.isPresent()) {
            saveClientWithCep(client);
        }
    }

    @Override
    public void deleteClient(Long id) {
        clientRepository.deleteById(id);
    }

    //method save ou update client
    private void saveClientWithCep(Client client) {
        String cep = client.getAddress().getCep();
        Endereco endereco = enderecoRepository.findById(cep).orElseGet(() -> {
            Endereco end = viaCepService.findCep(cep);
            enderecoRepository.save(end);
            return end;
        });
        client.setAddress(endereco);
        clientRepository.save(client);
    }
    
}
