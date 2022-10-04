package com.thais.estudos.teste.colecoes.testes;



import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>(6);

        mangas.add("Naruto");
        mangas.add("Itazura na kiss");
        mangas.add("One piece");
        mangas.add("Jujutso Kaisen");
        mangas.add("Dragon Ball Z");

        Collections.sort(mangas);

        List <Double> dinheiro = new ArrayList<>();
        dinheiro.add(20_498.35);
        dinheiro.add(1.00);
        dinheiro.add(304.98);
        dinheiro.add(29.05);

        for (String manga : mangas) {
            System.out.println(manga);
        }
        System.out.println(dinheiro);
        System.out.println("----COM SORT---");
        Collections.sort(dinheiro);
        System.out.println(dinheiro);


    }
}
