package com.thais.estudos.teste.lambdas;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaTest01 {
    public static void main(String[] args) {
        List<String> strings = List.of("Thais", "Matie", "Willian", "Massami");
        List<Integer> integers = new java.util.ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9));
        strings.forEach(System.out::println);
        integers.sort(Integer::compare);
        System.out.println(integers);
        integers.forEach( n -> {if (n %2 == 0){
            System.out.println(n);
        }});

    }

    //(List<T> list, Consumer<T> consumer ) esta passando os parametros
    // o metodo esta pedindo uma lista e chamando a lambda (Consumer) por argumento.
//    private static <T> void forEach(List<T> list, Consumer<T> consumer) {
//        for (T e : list) {
//            consumer.accept(e);
//
//        }

//    }



}

