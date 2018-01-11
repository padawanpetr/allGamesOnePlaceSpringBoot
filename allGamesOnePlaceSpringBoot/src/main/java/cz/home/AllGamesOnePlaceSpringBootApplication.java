package cz.home;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@SpringBootApplication
public class AllGamesOnePlaceSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(AllGamesOnePlaceSpringBootApplication.class, args);

	}
}
