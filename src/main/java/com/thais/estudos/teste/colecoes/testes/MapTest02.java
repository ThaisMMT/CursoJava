package com.thais.estudos.teste.colecoes.testes;

import com.thais.estudos.teste.colecoes.dominio.Consumidor;
import com.thais.estudos.teste.colecoes.dominio.Manga;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class MapTest02 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Thais");
        Consumidor consumidor2 = new Consumidor("Matie");


        Manga manga1 = new Manga(12L, "Naruto", 200);
        Manga manga2 = new Manga(2L, "Itazura na kiss", 18.90);
        Manga manga3 = new Manga(4L, "One piece", 30.80);
        Manga manga4 = new Manga(0L, "Jujutso Kaisen", 40.00);
        Manga manga5 = new Manga(5L, "Dragon Ball Z", 12.60);
        Manga manga6 = new Manga(5L, "Dragon Ball Z", 12.60);

        Map<Consumidor, Manga> consumidorManga = new HashMap<>();
        consumidorManga.put(consumidor1, manga1);
        consumidorManga.put(consumidor2, manga4);

        for (Map.Entry<Consumidor, Manga> entry : consumidorManga.entrySet()){
            System.out.println(entry.getKey()+ " - " + entry.getValue());
        }



    }
}
