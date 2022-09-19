package com.thais.estudos.teste.optional;

import java.util.List;
import java.util.Optional;

public class OptionalTest01 {
    public static void main(String[] args) {
        Optional<String> o1 = Optional.of("Aha Uhu ...");
        Optional<String> o2 = Optional.ofNullable(null);
        Optional<String> o3 = Optional.empty();

        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o3);
        System.out.println("-----");

        Optional<String> nameOptional = Optional.ofNullable(findName("Thais"));
        String empty = nameOptional.orElse("EMPTY");
        System.out.println(empty);

    }

    private static String findName(String name) {
        List<String> list = List.of("Thais","Matie");
        int i = list.indexOf(name);
        if (i > 0){
            return list.get(i);
        }

        return null;
    }
}
