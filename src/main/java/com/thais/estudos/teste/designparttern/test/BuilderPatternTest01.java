package com.thais.estudos.teste.designparttern.test;

import com.thais.estudos.teste.designparttern.dominio.Person;

public class BuilderPatternTest01 {
    public static void main(String[] args) {

        Person build = new Person.PersonBuilder()
                .firstName("Thais")
                .lastName("Matie")
                .userName("Thais_Matie")
                .email("thais@gmail.com")
                .build();
        System.out.println(build);


    }
}
