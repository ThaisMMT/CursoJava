package com.thais.estudos.teste.colecoes.testes;

import com.thais.estudos.teste.colecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MangaByIdComparator implements Comparator<Manga>{
    @Override
    public int compare(Manga manga1, Manga manga2) {
        return manga1.getId().compareTo(manga2.getId());
    }
}

public class MangaSortTest01 {


    public static void main(String[] args) {

        List<Manga> mangas = new ArrayList<>(6);

        mangas.add(new Manga(12L,"Naruto",200));
        mangas.add(new Manga(2L,"Itazura na kiss",18.90));
        mangas.add(new Manga(4L,"One piece",30.80));
        mangas.add(new Manga(0L,"Jujutso Kaisen",40.00));
        mangas.add(new Manga(5L,"Dragon Ball Z",12.60));
        mangas.add(new Manga(5L,"Dragon Ball Z",12.60));

        System.out.println("----------Sem ordenação-------");
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        System.out.println("--Comparable---COM compareTo()-----");
        Collections.sort(mangas);
        for (Manga manga : mangas) {
            System.out.println(manga);
        }


        System.out.println("--Comparator---compare-----");
//        Collections.sort(mangas,new MangaByIdComparator());
        mangas.sort(new MangaByIdComparator());
        for (Manga manga : mangas) {
            System.out.println(manga);
        }





    }
}
