package one.dio.gss.facade;

import subsystem1.crm.CrmService;
import subsystem2.cep.CepAPI;

public class Facade {

	public void migrateClient(String name, String cep) {
		String city = CepAPI.getInstance().getCity(cep);
		String state = CepAPI.getInstance().getState(cep);
		
		CrmService.saveClient(name, cep, city, state);
	}
	
}
