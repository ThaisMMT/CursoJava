package com.thais.estudos.teste.streams.teste;

import com.thais.estudos.teste.streams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//1. ordenar LightNovel by title
//2. Traga os 3 primeiro Light Novel que tenham o valor menor q 4
public class StreamTest02 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Naruto", 8.99),
            new LightNovel("Dragon Ball", 3.40),
            new LightNovel("One Piece", 1.50),
            new LightNovel("Itazura na Kiss", 0.45),
            new LightNovel("Jujutso no Kaisen", 7.90)
    ));

    public static void main(String[] args) {

        List<String> title = lightNovels.stream()
                .sorted(Comparator.comparing(LightNovel::getTitle))
                .filter(ln -> ln.getPrice() <= 4)
                .limit(3)
                .map(LightNovel::getTitle)
                .collect(Collectors.toList());
        System.out.println(title);
    }

}
