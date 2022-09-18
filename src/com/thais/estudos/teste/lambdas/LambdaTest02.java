package com.thais.estudos.teste.lambdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class LambdaTest02 {
    public static void main(String[] args) {


        List<String> strings = List.of("Naruto", "Lee", "Sakura", "Neji", "Hinata");
        List<Integer> string = map(strings, String::length);
        System.out.println(string);

        List<String> map = map(strings, String::toString);

    }

    private static <T, R> List <R> map(List<T> list, Function<T,R> function){
        List<R> result = new ArrayList<>();
        for (T e : list) {
            R r = function.apply(e);
            result.add(r);
        }
        return result;
    }

}

