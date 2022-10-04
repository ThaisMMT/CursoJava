package com.thais.estudos.teste.lambdas.teste;

import com.thais.estudos.teste.lambdas.dominio.Anime;
import com.thais.estudos.teste.lambdas.dominio.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;

//Referencia Metodo não estatico(static)
public class MethodResfereceTest03 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("Thais", "Willian", "Arathor", "Isildor"));
        list.sort(String::compareTo);
        System.out.println(list);
        Function<String, Integer> numStringToInterger = Integer::parseInt;
        System.out.println(numStringToInterger.apply("10"));

        BiPredicate <List<String>, String> checkName = List::contains;
        System.out.println(checkName.test(list,"Naruto"));

    }
}
