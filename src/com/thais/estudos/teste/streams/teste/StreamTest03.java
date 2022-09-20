package com.thais.estudos.teste.streams.teste;

import com.thais.estudos.teste.streams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//1. ordenar LightNovel by title
//2. Traga os 3 primeiro Light Novel que tenham o valor menor q 4
public class StreamTest03 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Naruto", 8.99),
            new LightNovel("Dragon Ball", 3.40),
            new LightNovel("One Piece", 1.50),
            new LightNovel("Itazura na Kiss", 0.45),
            new LightNovel("Jujutso no Kaisen", 7.90)
    ));

    public static void main(String[] args) {
        Stream<LightNovel> stream = lightNovels.stream();
        lightNovels.forEach(System.out::println);
        long count = stream
                .distinct()
                .filter(ln -> ln.getPrice() <= 4)
                .count();

        System.out.println(count);


    }



}
