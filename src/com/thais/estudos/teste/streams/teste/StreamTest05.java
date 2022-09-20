package com.thais.estudos.teste.streams.teste;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class StreamTest05 {
    public static void main(String[] args) {
      List<String> word = List.of("Amor","Gentileza","Paz","Amizade");
      String[] letters = word.get(0).split("");
        System.out.println(Arrays.toString(letters));

        List<String[]> collect = word.stream()
                .map(w -> w.split(""))
                .collect(Collectors.toList());

        Stream<String> stream = Arrays.stream(letters);
        List<String> letter2 = word.stream()
                .map(w -> w.split(""))
                .flatMap(Arrays::stream)
                .collect(Collectors.toList());
        System.out.println(letter2);
    }


}
