package com.thais.estudos.teste.streams.teste;

import com.thais.estudos.teste.streams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;


public class StreamTest04 {
    public static void main(String[] args) {
        List<List<String>> escola = new ArrayList<>();
        List<String> graphicDesigner = List.of("Thais","Ed", "Ana Salles","Pietro", "Victor", "Willian");
        List<String> developers = List.of("Agtha","Raphael", "Valentim","Sarah", "Oliver", "Christine");
        List<String> students = List.of("Dean", "Sam","Bobby", "Castiel");
        escola.add(graphicDesigner);
        escola.add(developers);
        escola.add(students);

        escola.stream()
                .flatMap(Collection::stream)
                .forEach(System.out::println);

    }


}
