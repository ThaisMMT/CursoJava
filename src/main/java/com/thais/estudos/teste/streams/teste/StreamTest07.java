package com.thais.estudos.teste.streams.teste;

import com.thais.estudos.teste.streams.dominio.LightNovel;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class StreamTest07 {

    public static void main(String[] args) {

        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6);

        integers.stream()
                .reduce((x, y) -> x + y)
                .ifPresent(System.out::println);
        System.out.println(integers.stream().reduce(0, (x, y) -> x + y));
        integers.stream().reduce(Integer::sum).ifPresent(System.out::println);
        System.out.println(integers.stream().reduce(0, Integer::sum));
        System.out.println("----Multiplicação-----");
        System.out.println(integers.stream().reduce((x, y) -> x * y));
        System.out.println(integers.stream().reduce(1, (x, y) -> x * y));

        System.out.println("----Trazendo o maior da lista-----");
        integers.stream().reduce((x, y) -> x > y ? x : y).ifPresent(System.out::println);
        System.out.println(integers.stream().reduce(Integer::max));

        System.out.println("-----Experiencia----");

        System.out.println(integers.stream()
                .map(n -> n * 3)
                .filter(n-> n%2 ==0)
                .collect(Collectors.toList())

        );


    }

}
