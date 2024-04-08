package one.dio.gss.singleton;

/**
 *  Lazy Initialization: 
 *  	Nessa abordagem, a instância é criada apenas quando necessária. 
 *  	Isso pode ajudar a economizar recursos de memória, mas pode resultar 
 *  	em um pequeno atraso no tempo de inicialização da instância.
 * 
 * 
	**Vantagens**:
	- Economia de recursos de memória, pois a instância é criada apenas quando necessária.
	
	**Desvantagens:**
	- Pode resultar em um pequeno atraso no tempo de inicialização da instância quando é necessária.
 * 
 * 
 * 
 * 
 * @author gabriel.soares.silva
 * */
public class SingletonLazy {
	
	private static SingletonLazy instance;
	
	private SingletonLazy() {
		super();
	}
	
	public static SingletonLazy getInstance(){
		if (instance == null) {
			instance = new SingletonLazy();
		}
		return instance;
	}
}
