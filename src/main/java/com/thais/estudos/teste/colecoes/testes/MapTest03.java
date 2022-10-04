package com.thais.estudos.teste.colecoes.testes;

import com.thais.estudos.teste.colecoes.dominio.Consumidor;
import com.thais.estudos.teste.colecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest03 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Thais");
        Consumidor consumidor2 = new Consumidor("Matie");


        Manga manga1 = new Manga(12L, "Naruto", 200);
        Manga manga2 = new Manga(2L, "Itazura na kiss", 18.90);
        Manga manga3 = new Manga(4L, "One piece", 30.80);
        Manga manga4 = new Manga(0L, "Jujutso Kaisen", 40.00);
        Manga manga5 = new Manga(5L, "Dragon Ball Z", 12.60);
        Manga manga6 = new Manga(5L, "Dragon Ball Z", 12.60);

        List <Manga> manga01 = List.of(manga1,manga2,manga5);
        List<Manga> manga02 = List.of(manga4,manga6,manga3);
        Map<Consumidor, List<Manga>> consumidorManga = new HashMap<>();
        consumidorManga.put(consumidor1, manga01);
        consumidorManga.put(consumidor2, manga02);

        for (Map.Entry<Consumidor, List<Manga>> entry : consumidorManga.entrySet()){
            System.out.println(entry.getKey().getNome());

            for (Manga manga : entry.getValue()){
                System.out.println(manga.getNome());
            }
        }






    }
}
