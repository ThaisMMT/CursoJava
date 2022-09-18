package com.thais.estudos.teste.colecoes.testes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaArrayTeste01 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();

        numeros.add(23);
        numeros.add(40);
        numeros.add(1);
        numeros.add(890);

        Integer[] listToArray = numeros.toArray(new Integer[0]);
        System.out.println(Arrays.toString(listToArray));
        System.out.println("---------------");

        Integer[] numerosArray = new Integer[3];
        numerosArray[0] = 1;
        numerosArray[1] = 2;
        numerosArray[2] = 3;

        List<Integer> arrayToList = Arrays.asList(numerosArray);
        arrayToList.set(0,12);
        System.out.println(Arrays.toString(numerosArray));
        System.out.println(arrayToList);

        List<Integer> numerosList = new ArrayList<>(Arrays.asList(numerosArray));

        Arrays.asList(1,2,3,4,5);

        List<String> strings = Arrays.asList("1","2");
        List.of("1,","2","3");
    }
}
