package com.example.demo.student;

import java.time.LocalDate;
import java.util.List;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableBatchProcessing
public class StudentConfig {

	@Bean
	CommandLineRunner commandLineRunner(StudentRepository repository) {
		return args->{
		    Student thawnanda = new Student("thawnanda","thawnanda@gmail.com",LocalDate.of(1999, 6, 6),19);
		    Student dardar = new Student("dardar","dardar@gmail.com",LocalDate.of(1989, 9, 6),22);
			repository.saveAll(
					List.of(thawnanda,dardar)
					);
		};
	}
}
