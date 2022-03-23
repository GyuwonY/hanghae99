package com.sparta.prac.prac;

import com.sparta.prac.prac.domain.PersonRepository;
import com.sparta.prac.prac.domain.PersonRequestDto;
import com.sparta.prac.prac.service.PersonService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class PracApplication {

    public static void main(String[] args) {
        SpringApplication.run(PracApplication.class, args);
    }
}
