import java.time.Duration;
import java.time.Instant;

public class StringsTimeConcat {
	
	public static void main(String[] args) {
		int iteracoes = 100_000;
		String term = "STUDYING PROGRAMMING JAVA";
		
		stringFormat(term,iteracoes);
		stringConcat(term,iteracoes);
		stringBuffer(term,iteracoes);
		stringBuilder(term,iteracoes);
		
	}

	private static void stringFormat(String term, int iteracoes) {
		String content = term;
		Instant begin = Instant.now();
		
		for (int i = 0; i < iteracoes; i++) {
			content = String.format("%s%s", content, term);
		}
		long miliseconds = Duration.between(begin, Instant.now()).toMillis();
		System.out.println("With String.format: "+miliseconds);
		
	}
	
	private static void stringConcat(String term, int iteracoes) {
		String content = term;
		Instant begin = Instant.now();
		
		for (int i = 0; i < iteracoes; i++) {
			content += term;
		}
		long miliseconds = Duration.between(begin, Instant.now()).toMillis();
		System.out.println("With concat String: "+miliseconds);
	}
	
	private static void stringBuffer(String term, int iteracoes) {
		StringBuffer content = new StringBuffer(term);
		Instant begin = Instant.now();
		
		for (int i = 0; i < iteracoes; i++) {
			content.append(term);
		}
		long miliseconds = Duration.between(begin, Instant.now()).toMillis();
		System.out.println("With StringBuffer: "+miliseconds);
	}

	private static void stringBuilder(String term, int iteracoes) {
		StringBuilder content = new StringBuilder(term);
		Instant begin = Instant.now();
		
		for (int i = 0; i < iteracoes; i++) {
			content.append(term);
		}
		long miliseconds = Duration.between(begin, Instant.now()).toMillis();
		System.out.println("With StringBuilder: "+miliseconds);
	}
	
}
