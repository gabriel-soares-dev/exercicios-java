package com.onegss.poe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@SpringBootApplication
public class TutorialRestKafkaConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TutorialRestKafkaConsumerApplication.class, args);
	}

}
