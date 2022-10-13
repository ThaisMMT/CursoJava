package com.thais.estudos.teste.junit.service;

import com.thais.estudos.teste.junit.dominio.Person;

import java.util.Objects;

public class PersonService {
    public boolean isAdult(Person person){
        Objects.requireNonNull("Person cant be null");
        person.getAge();
        return person.getAge() >= 18;
    }
}
