package com.thais.estudos.teste.colecoes.testes;

import com.thais.estudos.teste.colecoes.dominio.Smartphone;

public class EqualsTest01 {
    public static void main(String[] args) {
//        String nome = "Thais";
//        String nome2 = new String("Thais");
//
//        System.out.println(nome == nome2);
//        System.out.println(nome.equals(nome2));

        Smartphone s1 = new Smartphone("1ABC1","Iphone");
        Smartphone s2 = new Smartphone("1ABC1","Iphone");
        Smartphone s3 = s1;


        // a variavel s3 esta se referenciando ao mesmo objeto s1;
        // as variaveis s1 e s2 não estão referenciando o mesmo objeto;

        System.out.println(s1.equals(s2));// false
        System.out.println(s1.equals(s3));// true
    }





}
