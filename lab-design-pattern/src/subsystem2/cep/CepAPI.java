package subsystem2.cep;

import one.dio.gss.singleton.SingletonEager;

public class CepAPI {
	
	private static CepAPI instance = new CepAPI();
	
	private CepAPI() {
		super();
	}
	
	public static CepAPI getInstance() {
		return instance;
	}
	
	public String getCity(String cep) {
		return "RECIFE";
	}
	
	public String getState(String cep) {
		return "PE";
	}
}
