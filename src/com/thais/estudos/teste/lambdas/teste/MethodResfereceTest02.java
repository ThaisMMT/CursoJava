package com.thais.estudos.teste.lambdas.teste;

import com.thais.estudos.teste.lambdas.dominio.Anime;
import com.thais.estudos.teste.lambdas.dominio.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

//Referencia Metodo não estatico(static)
public class MethodResfereceTest02 {
    public static void main(String[] args) {
        AnimeComparators animeComparators = new AnimeComparators();
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Dragon Ball Z", 2200),
                new Anime("Naruto", 715),
                new Anime("One Piece", 900)));
//        animeList.sort(animeComparators::comparerByEpisodesNonStatic);
        animeList.sort((a1,a2) -> animeComparators.comparerByEpisodesNonStatic(a1,a2)); // usando lambda

        System.out.println(animeList);
    }
}
