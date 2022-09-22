package com.thais.estudos.teste.streams.teste;

import com.thais.estudos.teste.streams.dominio.Category;
import com.thais.estudos.teste.streams.dominio.LightNovel;
import com.thais.estudos.teste.streams.dominio.Promotion;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;


public class StreamTest14 {

    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Naruto", 8.99, Category.FANTASY),
            new LightNovel("Dragon Ball", 3.40, Category.FANTASY),
            new LightNovel("One Piece", 1.50, Category.DRAMA),
            new LightNovel("AM", 10.80, Category.DRAMA),
            new LightNovel("Itazura na Kiss", 0.45, Category.ROMANCE),
            new LightNovel("Itazura na Kiss", 0.45, Category.ROMANCE),
            new LightNovel("Jujutso no Kaisen", 7.90, Category.FANTASY)));

    public static void main(String[] args) {
        Map<Category, Long> collect = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.counting()));
        System.out.println(collect);
        Map<Category, Optional<LightNovel>> collect1 = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.maxBy(Comparator.comparing(LightNovel::getPrice))));
        System.out.println(collect1);

        Map<Category, LightNovel> collect2 = lightNovels.stream().collect(Collectors.toMap(LightNovel::getCategory, Function.identity(), BinaryOperator.maxBy(Comparator.comparing(LightNovel::getPrice))));
        System.out.println(collect2);
    }
}
