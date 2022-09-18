package com.thais.estudos.teste.colecoes.testes;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class ListaTeste01 {
    public static void main(String[] args) {
//        List <String> nome = new ArrayList(); //1.4
//        nome.add("Thais");
//        nome.add("Matie");
//        nome.add("Medeiros");
//        nome.add("Tateishi");
//
//        for(Object nomes : nome){
//            System.out.println(nomes);
//        }
//
//        List <Double> numeros = new ArrayList(); //1.4
//        numeros.add(14_986.30);
//        numeros.add(20.45);
//        numeros.add(1_000.00);
//        numeros.add(0.98);
//
//        for(Object numero : numeros){
//            System.out.println(numero);
//        }

        // java 1.5

        List<String> nome2 = new ArrayList<>(16); //1.5
        nome2.add("Thais");
        nome2.add("Matie");
        nome2.add("Medeiros");
        nome2.add("Tateishi");
        nome2.add("Nome para remover");
        nome2.remove("Nome para remover");


        for (String nome : nome2) {
            System.out.println("----------");
            System.out.println(nome);


        }

//        int size = nome2.size();
//        for (int i = 0 ; i < size; i++){
//            System.out.println(nome2.get(i));
//            nome2.add("Loop Infinito ...");
//            System.out.println("======");
//            System.out.println(nome2.get(i));
//        }

        List<Integer> numeros = new ArrayList<>();
        List<Integer> numeros1 = new ArrayList<>();
        numeros.add(1);
        numeros.add(45);
        numeros1.add(45);
        numeros1.add(46);
        numeros.addAll(numeros1);

        for (Integer numero : numeros) {
            System.out.println(numero);
        }


    }
}
