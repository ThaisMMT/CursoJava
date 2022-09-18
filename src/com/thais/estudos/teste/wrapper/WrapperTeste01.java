package com.thais.estudos.teste.wrapper;

public class WrapperTeste01 {
    public static void main(String[] args) {

        Byte byteW = 127;
        Short shortW = 1;
        Integer intW= 1; //autoboxing
        Long longW = 10L;
        Float floatW = 10F;
        Double doubleW = 10D;
        Character charW = 'W';
        Boolean booleanW = false;


        int i = intW; // unboxing
        Integer intW2 = Integer.parseInt("1");
        boolean verdadeiro = Boolean.parseBoolean("true");
        System.out.println(verdadeiro);



    }
}
