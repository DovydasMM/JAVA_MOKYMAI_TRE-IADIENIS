package com.example.demo.student;

import java.time.LocalDate;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

	@Bean
	CommandLineRunner commandLineRunner(StudentRepository repository) {
		return args -> {
			Student dovydas = new Student("Dovydas", "dovydas.maziliauskas@itreegroup.eu", LocalDate.of(1996, 2, 21));
			Student simona = new Student("Simona", "simona.simona@ldl.eu", LocalDate.of(1996, 6, 14));
			Student gintaras = new Student("Gintaras", "gintaras.maziliauskas@itreegroup.eu",
					LocalDate.of(1996, 10, 24));
			Student andzelika = new Student("Andzelika", "Aandzelika.andzelika@itreegroup.eu",
					LocalDate.of(2001, 02, 9));

			repository.saveAll(List.of(dovydas, simona, gintaras, andzelika));
		};
	}

}
