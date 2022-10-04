package com.thais.estudos.teste.colecoes.testes;

import com.thais.estudos.teste.colecoes.dominio.Manga;
import com.thais.estudos.teste.colecoes.dominio.Smartphone;

import java.util.*;

class SmartphoneMarcaComparator implements Comparator<Smartphone> {

    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}

class MangaPrecoComparator implements Comparator <Manga>{
    @Override
    public int compare(Manga o1, Manga o2) {
        return Double.compare(o1.getPreco(), o2.getPreco());
    }
}

public class NavegableSetTest01 {
    public static void main(String[] args) {

        NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneMarcaComparator());
        Smartphone smartphone = new Smartphone("123", "Nokia");
        set.add(smartphone);

        NavigableSet<Manga> mangas = new TreeSet<>(new MangaPrecoComparator());
        mangas.add(new Manga(12L, "Naruto", 200, 0));
        mangas.add(new Manga(2L, "Itazura na kiss", 18.90, 20));
        mangas.add(new Manga(4L, "One piece", 30.80, 0));
        mangas.add(new Manga(0L, "Jujutso Kaisen", 40.00, 12));
        mangas.add(new Manga(5L, "Dragon Ball Z", 12.60, 29));
        mangas.add(new Manga(6L, "Dragon Ball Super", 15.90, 5));
        mangas.add(new Manga(34L, "Boku no Hero Academia", 24.80, 5));

        for (Manga manga : mangas.descendingSet()) {
            System.out.println(manga);

        }


        Manga blackclover = new Manga(59L,"Black Clover",48.70,4);
        System.out.println("------------");
        System.out.println(mangas.lower(blackclover));
        System.out.println(mangas.floor(blackclover));
        System.out.println(mangas.higher(blackclover));
        System.out.println(mangas.ceiling(blackclover));
        //lower <
        //floor <=
        //higher >
        //ceiling >=


        System.out.println(mangas.size());
        System.out.println(mangas.pollFirst()); // vai retornar o primeiro elemento da linha e remove
        System.out.println(mangas.size());







    }
}
