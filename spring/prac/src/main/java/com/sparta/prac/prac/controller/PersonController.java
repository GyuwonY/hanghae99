package com.sparta.prac.prac.controller;

import com.sparta.prac.prac.domain.Person;
import com.sparta.prac.prac.domain.PersonRepository;
import com.sparta.prac.prac.domain.PersonRequestDto;
import com.sparta.prac.prac.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class PersonController {

    private final PersonRepository personRepository;

    private final PersonService personService;

    @PostMapping("/api/persons")
    public Person createPerson(@RequestBody PersonRequestDto requestDto) {
        Person person = new Person(requestDto);
        return personRepository.save(person);
    }

    @GetMapping("/api/persons")
    public List<Person> getPerson() {
        return personRepository.findAll();
    }

    @PutMapping("/api/persons/{id}")
    public Long createPerson(@PathVariable Long id,@RequestBody PersonRequestDto requestDto) {
        return personService.update(id, requestDto);
    }

    @DeleteMapping("/api/persons/{id}")
    public Long deletePerson(@PathVariable Long id){
        return personService.delete(id);
    }
}
