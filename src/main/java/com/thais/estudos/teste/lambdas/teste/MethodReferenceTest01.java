package com.thais.estudos.teste.lambdas.teste;

import com.thais.estudos.teste.lambdas.dominio.Anime;
import com.thais.estudos.teste.lambdas.dominio.service.AnimeComparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Referencia metodo Static
public class MethodReferenceTest01 {
    public static void main(String[] args) {
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Dragon Ball Z", 2200),
                new Anime("Naruto", 715),
                new Anime("One Piece", 900)));
        animeList.sort((a1, a2) -> a1.getTitle().compareTo(a2.getTitle()));
        animeList.sort(AnimeComparators::compareByTitle);
        animeList.sort(AnimeComparators::comparerByEpisodes);
        System.out.println(animeList);
    }
}
