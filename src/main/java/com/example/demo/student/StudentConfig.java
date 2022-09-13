package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.OCTOBER;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
           Student navin = new Student(
             "Navinprakash Raja",
             "navinprakashronaldo@gmail.com",
                   LocalDate.of(1997, OCTOBER, 29)
           );
            Student anis = new Student(
                    "Anisfathima Navinprakash",
                    "sathyanisfathima@gmail.com",
                    LocalDate.of(1997, OCTOBER, 29)
            );

            repository.saveAll(
                    List.of(navin, anis)
            );
        };
    }
}
