package com.thais.estudos.teste.streams.teste;

import com.thais.estudos.teste.streams.dominio.Category;
import com.thais.estudos.teste.streams.dominio.LightNovel;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class StreamTest12 {

    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Naruto", 8.99, Category.FANTASY),
            new LightNovel("Dragon Ball", 3.40, Category.FANTASY),
            new LightNovel("One Piece", 1.50, Category.DRAMA),
            new LightNovel("AM", 10.80, Category.DRAMA),
            new LightNovel("Itazura na Kiss", 0.45, Category.ROMANCE),
            new LightNovel("Itazura na Kiss", 0.45, Category.ROMANCE),
            new LightNovel("Jujutso no Kaisen", 7.90, Category.FANTASY)));

    public static void main(String[] args) {
        //Fazendo sem Stream
        Map<Category, List<LightNovel>> categoryLightNovelMap = new HashMap<>();
        List<LightNovel> fantasy = new ArrayList<>();
        List<LightNovel> drama = new ArrayList<>();
        List<LightNovel> romance = new ArrayList<>();

        for (LightNovel lightNovel : lightNovels) {
            switch (lightNovel.getCategory()){
                case DRAMA:drama.add(lightNovel); break;
                case FANTASY: fantasy.add(lightNovel); break;
                case ROMANCE: romance.add(lightNovel); break;
            }
            categoryLightNovelMap.put(Category.DRAMA,drama);
            categoryLightNovelMap.put(Category.FANTASY,fantasy);
            categoryLightNovelMap.put(Category.ROMANCE,romance);

            System.out.println(categoryLightNovelMap);

        }

        System.out.println("---USANDO STREAM----");
        // Usando stream
        Map<Category, List<LightNovel>> collect = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory));


        System.out.println(collect);

    }
}
