package com.thais.estudos.teste.streams.teste;

import com.thais.estudos.teste.streams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;


public class StreamTest08 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Naruto", 8.99),
            new LightNovel("Dragon Ball", 3.40),
            new LightNovel("One Piece", 1.50),
            new LightNovel("AM", 10.80),
            new LightNovel("Itazura na Kiss", 0.45),
            new LightNovel("Itazura na Kiss", 0.45),
            new LightNovel("Jujutso no Kaisen", 7.90)
    ));

    public static void main(String[] args) {

        lightNovels.stream()
                .map(LightNovel::getPrice)
                .filter(price-> price > 3)
                .reduce(Double::sum)
                .ifPresent(System.out::println);

        double sum = lightNovels.stream()
                .mapToDouble(LightNovel::getPrice)
                .filter(price -> price > 3)
                .sum();

        System.out.println(sum);
    }
}
