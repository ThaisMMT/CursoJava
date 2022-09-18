package com.thais.estudos.teste.colecoes.testes;

import com.thais.estudos.teste.colecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTeste02 {
    public static void main(String[] args) {

        MangaByIdComparator mangaByIdComparator = new MangaByIdComparator();
        List<Manga> mangas = new ArrayList<>(6);

        mangas.add(new Manga(12L,"Naruto",200));
        mangas.add(new Manga(2L,"Itazura na kiss",18.90));
        mangas.add(new Manga(4L,"One piece",30.80));
        mangas.add(new Manga(0L,"Jujutso Kaisen",40.00));
        mangas.add(new Manga(5L,"Dragon Ball Z",12.60));
        mangas.add(new Manga(5L,"Dragon Ball Z",12.60));
//        Collections.sort(mangas);
        mangas.sort(mangaByIdComparator);
        System.out.println("----Ordenado---");
        for (Manga manga : mangas) {
            System.out.println(manga);
            
        }


        System.out.println("====Binary Search====");
        Manga mangaToSearch = new Manga(2L,"Itazura na kiss",18.90);
        System.out.println(Collections.binarySearch(mangas,mangaToSearch,mangaByIdComparator));




    }
}
