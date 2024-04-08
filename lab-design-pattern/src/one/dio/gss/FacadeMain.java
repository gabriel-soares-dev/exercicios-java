package one.dio.gss;

import one.dio.gss.facade.Facade;

public class FacadeMain {
		
	public static void main(String[] args) {
		Facade fc = new Facade();
		fc.migrateClient("Pedro", "22879981");
	}

}
