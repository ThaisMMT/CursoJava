package com.thais.estudos.teste.streams.teste;

import com.thais.estudos.teste.streams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//1. ordenar LightNovel by title
//2. Traga os 3 primeiro Light Novel que tenham o valor menor q 4
public class StreamTest01 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Naruto", 8.99),
            new LightNovel("Dragon Ball", 3.40),
            new LightNovel("One Piece", 1.50),
            new LightNovel("Itazura na Kiss", 0.45),
            new LightNovel("Jujutso no Kaisen", 7.90)
    ));

    public static void main(String[] args) {
        lightNovels.sort(Comparator.comparing(LightNovel::getTitle));
        List<String> titles = new ArrayList<>();
        for (LightNovel lightNovel : lightNovels) {
            if (lightNovel.getPrice() <= 4) {
                lightNovel.getTitle();
                titles.add(lightNovel.getTitle());

            }

            if (titles.size() >= 3){
                break;
            }
        }


        System.out.println(lightNovels);
        System.out.println(titles);
    }

}
