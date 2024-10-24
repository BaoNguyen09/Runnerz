package dev.baonguyen.runnerz;

import dev.baonguyen.runnerz.Run.Location;
import dev.baonguyen.runnerz.Run.Run;
import dev.baonguyen.runnerz.Run.RunRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

@SpringBootApplication
public class Application {

	private static final Logger log = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);
		log.info("Application run successfully!");
	}

	@Bean
	CommandLineRunner runner(RunRepository runRepository) {
		return args -> {
			Run run = new Run(1, "First Run", LocalDateTime.now(), LocalDateTime.now().plusHours(1), 5.0, Location.OUTDOOR);
			log.info("Run: " + run);
			runRepository.create(run);
		};
	}

}
