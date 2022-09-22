package com.thais.estudos.teste.streams.teste;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class StreamTest10 {
    public static void main(String[] args) {

        Stream.iterate(1,n -> n+2).limit(10).forEach(System.out::println);

        Stream.iterate(new int[]{0,1}, n-> new int[]{n[1], n[0] + n[1]})
                .limit(10)
                .forEach(a -> System.out.println(Arrays.toString(a)));


    }
}
