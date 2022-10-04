package com.thais.estudos.teste.colecoes.testes;

import com.thais.estudos.teste.colecoes.dominio.Consumidor;
import com.thais.estudos.teste.colecoes.dominio.Manga;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest02 {
    public static void main(String[] args) {

        Queue<Manga> manga = new PriorityQueue<>(new MangaPrecoComparator().reversed());

        manga.add(new Manga(12L, "Naruto", 200));
        manga.add(new Manga(2L, "Itazura na kiss", 18.90));
        manga.add(new Manga(4L, "One piece", 30.80));
        manga.add(new Manga(0L, "Jujutso Kaisen", 40.00));
        manga.add(new Manga(5L, "Dragon Ball Z", 12.60));
        manga.add(new Manga(5L, "Dragon Ball Z", 12.60));

        while (!manga.isEmpty()) {
            System.out.println(manga.poll());
        }

    }
}
