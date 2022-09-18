package com.thais.estudos.teste.generics.test;

import java.util.ArrayList;
import java.util.List;

abstract class Animal {
    public abstract void consulta();
}

class Cachorro extends Animal {
    @Override
    public void consulta() {
        System.out.println("Consultando o Cachorro");
    }
}

class Gato extends Animal {
    @Override
    public void consulta() {
        System.out.println("Consultando o Gato");
    }
}

public class WildcardTest01 {
    public static void main(String[] args) {

        List<Cachorro> cachorros = List.of(new Cachorro());
        List<Gato> gatos = List.of(new Gato(),new Gato());
        printConsulta(cachorros);
        printConsulta(gatos);
        List<Animal> animals = List.of(new Cachorro(), new Gato());
        printConsulta(animals);
        List<Animal> animais = new ArrayList<>();
        printConsultaAnimal(animais);


    }

    private static void printConsulta(List<? extends Animal> animais) {


        for (Animal animal : animais) {
            animal.consulta();

        }


    }

    private static void printConsultaAnimal(List<? super Animal> animais) {
        animais.add(new Cachorro());
        animais.add(new Gato());

    }
}
