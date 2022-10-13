package com.thais.estudos.teste.junit.test;

import com.thais.estudos.teste.junit.dominio.Person;
import com.thais.estudos.teste.junit.service.PersonService;
import lombok.extern.log4j.Log4j2;
import org.apache.logging.log4j.core.util.JsonUtils;

@Log4j2
public class PersonServiceTest01 {
    public static void main(String[] args) {

    Person person = new Person(15);
    PersonService personService = new PersonService();
    log.info("Is adult? '{}'", personService.isAdult(person));
}
}
