package com.thais.estudos.teste.string;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "Thais "; // String constant pool
        String nome2 = "Thais ";
        nome.concat("Matie");

        System.out.println(nome);

        System.out.println(nome == nome2);
        String nome3 = new String("Thais ");// 1- variavel de referencia, 2- objeto do tipo string, 3 - uma string no pool de stgring
        System.out.println(nome2 == nome3.intern());
    }

}
