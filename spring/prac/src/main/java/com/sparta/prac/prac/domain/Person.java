package com.sparta.prac.prac.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Long age;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private String job;

    public Person(PersonRequestDto requestDto){
        this.address = requestDto.getAddress();
        this.name = requestDto.getName();
        this.age = requestDto.getAge();
        this.job = requestDto.getJob();
    }

    public void update(PersonRequestDto requestDto){
        this.address = requestDto.getAddress();
        this.name = requestDto.getName();
        this.age = requestDto.getAge();
        this.job = requestDto.getJob();
    }

}
