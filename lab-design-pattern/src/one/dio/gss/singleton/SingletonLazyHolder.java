package one.dio.gss.singleton;

/**
 * Lazy Holder Singleton: 
 * 	Nessa abordagem, a instância é criada apenas quando necessária, 
 * 	mas de uma maneira mais segura e eficiente, utilizando uma classe 
 * 	interna para garantir a inicialização preguiçosa da instância 
 * 	de forma segura e concorrente.
 * 
	**Vantagens:**
	- Garante a inicialização preguiçosa da instância de forma segura e eficiente, utilizando uma classe interna.
	
	- Permite a inicialização segura e concorrente da instância quando necessária.
	
	**Desvantagens:**
	- Pode ser mais complexa de implementar em comparação com as outras abordagens.
 * 
 * @author gabriel.soares.silva
 * */
public class SingletonLazyHolder {
	
	private static class Holder {
		public static SingletonLazyHolder instance = new SingletonLazyHolder();
	}
	
	private SingletonLazyHolder() {
		super();
	}
	
	public static SingletonLazyHolder getInstance(){
		return Holder.instance;
	}
}
