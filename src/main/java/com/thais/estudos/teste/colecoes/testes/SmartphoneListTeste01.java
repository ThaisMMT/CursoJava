package com.thais.estudos.teste.colecoes.testes;

import com.thais.estudos.teste.colecoes.dominio.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneListTeste01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1ABC1","Iphone");
        Smartphone s2 = new Smartphone("2222","Pixel");
        Smartphone s3 = new Smartphone("3333","Samung");

        List <Smartphone> smartphones = new ArrayList<>(6);
        smartphones.add(s1);
        smartphones.add(s2);
        smartphones.add(0,s3);


        for (Smartphone smartphone : smartphones) {
            System.out.println(smartphone);
        }



        Smartphone s4 = new Smartphone("2222","Pixel");

        System.out.println(s4.equals(s2));
        System.out.println(smartphones.contains(s4));
        int indexSmartphoneS4 = smartphones.indexOf(s4);
        System.out.println(indexSmartphoneS4);
        System.out.println(smartphones.get(indexSmartphoneS4));


    }
}
