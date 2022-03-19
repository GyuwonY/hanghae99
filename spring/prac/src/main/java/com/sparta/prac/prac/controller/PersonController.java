package com.sparta.prac.prac.controller;

import com.sparta.prac.prac.domain.Person;
import com.sparta.prac.prac.domain.PersonRepository;
import com.sparta.prac.prac.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class PersonController {

    private final PersonRepository personRepository;

    private final PersonService personService;


}
