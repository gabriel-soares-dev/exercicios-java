package one.dio.gss.singleton;

/**
 * Eager Singleton: 
 * 	Na implementação do Eager Singleton, a instância é criada no momento 
 * 	em que a classe é carregada, independentemente de ser necessária ou não. 
 * 	Isso garante que a instância esteja sempre disponível, 
 * 	mas pode consumir mais recursos de memória, especialmente se a instância 
 * 	não for utilizada durante a execução do programa.
 *  
	**Vantagens:**
	- Garante que a instância esteja sempre disponível, independentemente de ser necessária ou não.
	
	**Desvantagens:**
	- Pode consumir mais recursos de memória, especialmente se a instância não for utilizada durante a execução do programa.
 * 
 * 
 * @author gabriel.soares.silva
 * */
public class SingletonEager {
	
	private static SingletonEager instance = new SingletonEager();
	
	private SingletonEager() {
		super();
	}
	
	public static SingletonEager getInstance() {
		return instance;
	}
}
