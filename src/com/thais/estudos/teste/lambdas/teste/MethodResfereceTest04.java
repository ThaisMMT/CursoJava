package com.thais.estudos.teste.lambdas.teste;

import com.thais.estudos.teste.lambdas.dominio.Anime;
import com.thais.estudos.teste.lambdas.dominio.service.AnimeComparators;

import java.beans.BeanInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Supplier;

//Referencia para um construtor
public class MethodResfereceTest04 {
    public static void main(String[] args) {
        Supplier<AnimeComparators> newAnimecomparator = AnimeComparators::new;
        AnimeComparators animeComparators = newAnimecomparator.get();
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Dragon Ball Z", 2200),
                new Anime("Naruto", 715),
                new Anime("One Piece", 900)));


        animeList.sort(animeComparators::comparerByEpisodesNonStatic);

        System.out.println(animeList);
//        BiFunction <String, Integer, Anime> animeBiFunction = (title, episodes) -> new Anime(title, episodes);
        BiFunction <String, Integer, Anime> animeBiFunction = Anime::new;
        System.out.println(animeBiFunction.apply("Super campeões", 36));

    }
}
