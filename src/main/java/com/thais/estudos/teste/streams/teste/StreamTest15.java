package com.thais.estudos.teste.streams.teste;

import com.thais.estudos.teste.streams.dominio.Category;
import com.thais.estudos.teste.streams.dominio.LightNovel;
import com.thais.estudos.teste.streams.dominio.Promotion;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;


public class StreamTest15 {

    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Naruto", 8.99, Category.FANTASY),
            new LightNovel("Dragon Ball", 3.40, Category.FANTASY),
            new LightNovel("One Piece", 1.50, Category.DRAMA),
            new LightNovel("AM", 10.80, Category.DRAMA),
            new LightNovel("Itazura na Kiss", 0.45, Category.ROMANCE),
            new LightNovel("Itazura na Kiss", 0.45, Category.ROMANCE),
            new LightNovel("Jujutso no Kaisen", 7.90, Category.FANTASY)));

    public static void main(String[] args) {
        Map<Category, DoubleSummaryStatistics> collect = lightNovels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory,
                        Collectors.summarizingDouble(LightNovel::getPrice)));
        System.out.println(collect);

        Map<Category, Set<Promotion>> collect1 = lightNovels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.mapping(StreamTest15::getPromotion, Collectors.toSet())));

    }

    private static Promotion getPromotion(LightNovel ln){
        return ln.getPrice()<6?Promotion.UNDER_PROMATION:Promotion.NORMAL_PRICE;
    }
}
