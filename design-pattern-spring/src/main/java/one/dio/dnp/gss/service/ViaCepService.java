package one.dio.dnp.gss.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import one.dio.dnp.gss.model.Endereco;

@FeignClient(name = "viacep", url ="https://viacep.com.br/ws")
public interface ViaCepService {
    
    @GetMapping("/{cep}/json/")
    Endereco findCep(@PathVariable("cep") String cep);
}
