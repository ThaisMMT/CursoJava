package com.thais.estudos.teste.colecoes.testes;

import com.thais.estudos.teste.colecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTeste01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);

        mangas.add(new Manga(12L, "Naruto", 200, 0));
        mangas.add(new Manga(2L, "Itazura na kiss", 18.90, 20));
        mangas.add(new Manga(4L, "One piece", 30.80, 0));
        mangas.add(new Manga(0L, "Jujutso Kaisen", 40.00, 12));
        mangas.add(new Manga(5L, "Dragon Ball Z", 12.60, 29));
        mangas.add(new Manga(5L, "Dragon Ball Z", 12.60, 0));

        Iterator<Manga> mangaIterator = mangas.iterator();
//        while (mangaIterator.hasNext()) {
//            Manga manga = mangaIterator.next();
//            if (manga.getQuantidade() == 0) {
//                mangaIterator.remove();
//            }
//            System.out.println(mangas);
//    }
        mangas.removeIf(manga -> manga.getQuantidade() == 0);
        // Navegue pela lista manga, remova se quantidase de manga for 0
        System.out.println(mangas);

    }
}

