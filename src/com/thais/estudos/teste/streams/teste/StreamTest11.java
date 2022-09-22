package com.thais.estudos.teste.streams.teste;

import com.thais.estudos.teste.streams.dominio.LightNovel;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class StreamTest11 {

    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Naruto", 8.99),
            new LightNovel("Dragon Ball", 3.40),
            new LightNovel("One Piece", 1.50),
            new LightNovel("AM", 10.80),
            new LightNovel("Itazura na Kiss", 0.45),
            new LightNovel("Itazura na Kiss", 0.45),
            new LightNovel("Jujutso no Kaisen", 7.90)));

    public static void main(String[] args) {
        System.out.println(lightNovels.stream().count());
        System.out.println(lightNovels.stream().collect(Collectors.counting()));

        lightNovels.stream().max(Comparator.comparing(LightNovel::getPrice)).ifPresent(System.out::println);
        lightNovels.stream().collect(Collectors.maxBy(Comparator.comparing(LightNovel::getPrice))).ifPresent(System.out::println);

        System.out.println(lightNovels.stream().mapToDouble(LightNovel::getPrice).average());
        System.out.println(lightNovels.stream().collect(Collectors.averagingDouble(LightNovel::getPrice)));

        DoubleSummaryStatistics collect = lightNovels.stream().collect(Collectors.summarizingDouble(LightNovel::getPrice));
        System.out.println(collect);

        String titles = lightNovels.stream().map(LightNovel::getTitle).collect(Collectors.joining(", "));
        System.out.println(titles);


    }
}
