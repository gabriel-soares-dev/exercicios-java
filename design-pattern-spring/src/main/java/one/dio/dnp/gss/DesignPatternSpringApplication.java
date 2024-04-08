package one.dio.dnp.gss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@EnableFeignClients
@SpringBootApplication
public class DesignPatternSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesignPatternSpringApplication.class, args);
	}

}
