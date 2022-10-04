package com.thais.estudos.teste.streams.teste;

import com.thais.estudos.teste.streams.dominio.Category;
import com.thais.estudos.teste.streams.dominio.LightNovel;
import com.thais.estudos.teste.streams.dominio.Promotion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class StreamTest13 {

    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Naruto", 8.99, Category.FANTASY),
            new LightNovel("Dragon Ball", 3.40, Category.FANTASY),
            new LightNovel("One Piece", 1.50, Category.DRAMA),
            new LightNovel("AM", 10.80, Category.DRAMA),
            new LightNovel("Itazura na Kiss", 0.45, Category.ROMANCE),
            new LightNovel("Itazura na Kiss", 0.45, Category.ROMANCE),
            new LightNovel("Jujutso no Kaisen", 7.90, Category.FANTASY)));

    public static void main(String[] args) {
        Map<Promotion, List<LightNovel>> collect = lightNovels.stream()
                .collect(Collectors.groupingBy(ln -> {
                    return ln.getPrice() < 6 ? Promotion.UNDER_PROMATION : Promotion.NORMAL_PRICE;

                }));
        System.out.println(collect);

        Map<Category, Map<Promotion, List<LightNovel>>> collect1 = lightNovels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.groupingBy(ln -> {
                    return ln.getPrice() < 6 ? Promotion.UNDER_PROMATION : Promotion.NORMAL_PRICE;

                })));
        System.out.println(collect1);

    }

    private static Promotion getPromotion(LightNovel ln){
        return ln.getPrice()<6?Promotion.UNDER_PROMATION:Promotion.NORMAL_PRICE;
    }
}
