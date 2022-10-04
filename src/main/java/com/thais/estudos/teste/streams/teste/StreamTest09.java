package com.thais.estudos.teste.streams.teste;

import com.thais.estudos.teste.streams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class StreamTest09 {
    public static void main(String[] args) {
        IntStream.rangeClosed(1,50)
                .filter(n->n%2==0)
                .forEach(n -> System.out.println(n + " "));
        System.out.println();

        IntStream.range(1,50)
                .filter(n->n%2==0)
                .forEach(n -> System.out.print(n + " "));

        Stream.of("Eleve", "o", "cosmo","no", "seu","coração").map(String::toUpperCase).forEach(System.out::println);


    }

}
