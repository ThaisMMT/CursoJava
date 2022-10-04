package com.thais.estudos.teste.colecoes.testes;

import com.thais.estudos.teste.colecoes.dominio.Manga;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args) {

      Set <Manga> mangas = new HashSet<>();

        mangas.add(new Manga(12L, "Naruto", 200, 0));
        mangas.add(new Manga(2L, "Itazura na kiss", 18.90, 20));
        mangas.add(new Manga(4L, "One piece", 30.80, 0));
        mangas.add(new Manga(0L, "Jujutso Kaisen", 40.00, 12));
        mangas.add(new Manga(5L, "Dragon Ball Z", 12.60, 29));
        mangas.add(new Manga(6L, "Dragon Ball Super", 15.90, 5));


        for (Manga manga : mangas) {
            System.out.println(manga);
            
        }


    }

}
